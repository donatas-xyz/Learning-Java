import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


class GUI {
	 private static final int H = 400;       // Height of window pixels 
	  private static final int W = 500;       // Width  of window pixels 

	  private JLabel      theMes      = new JLabel();       // Message area 
	  private JTextArea   theOutput1  = new JTextArea();    // Input number area 
	  private JTextArea   theOutput2  = new JTextArea();    // Result area 
	  private JScrollPane theSP       = new JScrollPane();

	  private ButtonPress onButtonPress = new ButtonPress();

	  public void display()
	  {
	    JFrame rpc           = new JFrame();            // Window 
	    Container cp         = rpc.getContentPane();    // Content Pane 
	    Container rootWindow = (Container) rpc;         // Root Window 
	    cp.setLayout(null);                             // No layout manager 
	    rootWindow.setSize( W, H );                     // Size of Window 

	    String labels[] = {
	        "Brighton",     "Buy", "10", 
	        "London Road",  "Cancel", "20",
	        "Falmer",       "",    "50",
	        "Lewes",        "200", "100" };

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

	    final int BNR  = 4,    BNC  = 3;       // number rows cols of buttons 
	    final int BW  = W/BNC, BH = HBUT/BNR;  // Size of landscape for button 
	    final int SBH = SHBUT, SBW = 7;        // Start position for buttons 


	    JButton buttons[] = new JButton[LABELS];


	    Font font = null;
	    for ( int i=0; i<LABELS; i++ )
	    {
	      if ( labels[i].length() >= 1 )
	      {
	        if ( labels[i].length() <= 10 )
	          font = new Font("Serif",Font.BOLD,20);      // Button font 
	        else
	          font = new Font("Serif",Font.BOLD,14);      // Button font 
	        buttons[i] = new JButton( labels[i] );
	        final int col = i%BNC * BW, row = i/BNC * BH;
	        buttons[i].setBounds( SBW+col, SBH+row, BW-20, BH-10 );
	        buttons[i].addActionListener( onButtonPress );
	        buttons[i].setFont( font );
	        cp.add( buttons[i] );
	      }
	    }

	    font = new Font("Serif",Font.BOLD,14);         // Font is 

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

	    theMes.setText( "Ticket Machine" );            // Opening message 
	    rpc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Exit close 
	  }

	  Logic logic = new Logic(theOutput1, theOutput2 );
	  
	  class ButtonPress implements ActionListener       // Listener 
	  {
	    public void actionPerformed( ActionEvent ae )   // Interaction 
	    {
	      String label = ae.getActionCommand();         // Button label   
	   
	      logic.process(label);
	    }
	  }
}
