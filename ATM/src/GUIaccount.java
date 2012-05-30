import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * BCS C1a
 * GUIaccount.java
 * Purpose: ATM front-end. Sends values to Logic class.
 *
 * @version 0.1 12/05/2012
 * @author Mike Smith
 */
class GUIaccount
{
  private static final int H = 400;       // Height of window pixels 
  private static final int W = 500;       // Width  of window pixels 

  private JLabel      theMes      = new JLabel();       // Message area 
  private JTextArea   theOutput1  = new JTextArea();    // Result area 
  private JTextArea   theOutput2  = new JTextArea();    // Result area 
  private JScrollPane theSP       = new JScrollPane();

  private ButtonPress onButtonPress = new ButtonPress();

  private Logic logic;

  public void display()
  {
    JFrame rpc           = new JFrame();          // Window 
    Container cp         = rpc.getContentPane();  // Content Pane 
    Container rootWindow = rpc;       // Root Window 
    cp.setLayout(null);                           // No layout manager 
    rootWindow.setSize( W, H );                   // Size of Window 

    String labels[] = {
        "7",  "8", "9", "", "Dep", "",
        "4",  "5", "6", "", "W/D", "",
        "1",  "2", "3", "", "Bal", "Fin",
        "CLR",  "0", "", "",   "",   "Ent" };

    final int LABELS = labels.length;      // # Button Labels 

    final int GAP   = 15;                  // Horizontal Gap 

    final int HLAB  = 20;                  // Label 
    final int SHLAB = GAP;
    final int EHLAB = SHLAB+HLAB;

    final int HTA1  = 30;                  // Output area 1 
    final int SHTA1 = EHLAB + GAP;
    final int EHTA1 = SHTA1 + HTA1;

    final int HTA2  = 100;                 // Output area 2 
    final int SHTA2 = EHTA1 + GAP;
    final int EHTA2 = SHTA2 + HTA2;

    final int HBUT  = 170;                 // Buttons 
    final int SHBUT = EHTA2 + GAP;

    final int BNR  = 4,    BNC  = 6;       // number rows cols buttons 
    final int BW  = W/BNC, BH = HBUT/BNR;  // Size of landscape 
    final int SBH = SHBUT, SBW = 7;        // Initial pos. for buttons 


    JButton buttons[] = new JButton[LABELS];


    for ( int i=0; i<LABELS; i++ )
    {
      String label = labels[i];
      if ( label.length() >= 1 )
      {
        buttons[i] = new JButton( label );
        final int col = i%BNC * BW, row = i/BNC * BH;
        buttons[i].setBounds( SBW+col, SBH+row, BW-20, BH-10 );
        buttons[i].addActionListener( onButtonPress );
        Font font = new Font("Serif",Font.BOLD,
                            label.length() == 1 ? 20 : 14 );
        buttons[i].setFont( font );
        cp.add( buttons[i] );
      }
    }

    Font font = new Font("Serif",Font.BOLD,14);    // Font is 

    theMes.setBounds( 10, SHLAB, W-25, HLAB );     // Message area 
    theMes.setText( "" );                          // Blank 
    theOutput1.setFont( font );                    //  Uses font  
    cp.add( theMes );                              //  Add to canvas 

    theOutput1.setBounds( 10, SHTA1, W-25, HTA1 ); // Input Area 
    theOutput1.setText("");                        // Blank 
    theOutput1.setFont( font );                    //  Uses font  
    cp.add( theOutput1 );                          //  Add to canvas 

    font = new Font("Serif",Font.BOLD,14);         // Font is 

    theSP.setBounds( 10, SHTA2, W-25, HTA2 );      // Scrolling pane 
    theOutput2.setText( "" );                      //  Blank 
    theOutput2.setFont( font );                    //  Uses font   
    cp.add( theSP );                               //  Add to canvas 
    theSP.getViewport().add( theOutput2 );         //  In TextArea 
    rootWindow.setVisible( true );                 // Make visible 

    theMes.setText( "Bank" );                      // Opening message 
    logic  = new Logic( theOutput1, theOutput2 );
  }

  
  class ButtonPress implements ActionListener       // Listener 
  {
    @Override
	public void actionPerformed( ActionEvent ae )   // Interaction 
    {
      String label = ae.getActionCommand();         // Button label   
   
      logic.process(label);
    }
  }
}
