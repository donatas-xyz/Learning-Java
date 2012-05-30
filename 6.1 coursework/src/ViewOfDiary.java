import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * View of a diary (Graphical)
 */

class ViewOfDiary implements Observer
{
  private final int YEAR  = 0;
  private final int MONTH = 1;
  private final int DAY   = 2;

  private JTextField[] date;     // Visual Year Month Day 
  private JTextArea diaryEntry;  // Visual Todays events 
  private JTextArea diaryStatus; // Visual Status information 

  public String getTodaysMessage()
  {
    return diaryEntry.getText();
  }

  public void setController( Controller cont )
  {
    DiaryGUI diaryGUI = new DiaryGUI( cont );
    date        = diaryGUI.getDate();
    diaryEntry  = diaryGUI.getDiaryEntry();
    diaryStatus = diaryGUI.getStatusEntry();
  }

  public void update( Observable aModelOfDiary, Object arg )
  {
    ModelOfDiary model = (ModelOfDiary) aModelOfDiary;
    	
    date[DAY].setText  (String.format("%02d", model.getDay()));
    date[MONTH].setText(String.format("%02d", model.getMonth()));
    date[YEAR].setText (String.format("%04d", model.getYear()));
	
    String message = model.getMessageForToday();
	
    diaryEntry.setText( message );
	
    diaryStatus.setText( String.format( "%04d  %02d  %02d",
                         model.getYear(), model.getMonth(),
                         model.getDay() )
                       );
  }

}
