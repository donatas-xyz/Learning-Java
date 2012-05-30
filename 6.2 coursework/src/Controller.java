
/*
 * Deal with DiaryGUI interactions from user
 */

class Controller
{
  private ModelOfDiary diary;
  private ViewOfDiary  view;
  private boolean changedEntry = false;

  public Controller( ModelOfDiary aModelOfDiary, ViewOfDiary aViewOfDiary )
  {
    diary = aModelOfDiary;
    view  = aViewOfDiary;
    view.setController( this );
  }

  public void updatedEntryInDiary()
  {
    changedEntry = true;
  }

  public void process( String button )
  {
    if ( changedEntry )
    {
      String toDaysMessage = view.getTodaysMessage();
      diary.saveMessageForToday( toDaysMessage );
      changedEntry = false;
    }
	
         if ( button.equals( "+Y" ) ) { diary.addToYear(+1); }
    else if ( button.equals( "-Y" ) ) { diary.addToYear(-1); }
    else if ( button.equals( "+M" ) ) { diary.addToMonth(+1); }
    else if ( button.equals( "-M" ) ) { diary.addToMonth(-1); }
    else if ( button.equals( "+D" ) ) { diary.addToDay(+1); }
    else if ( button.equals( "-D" ) ) { diary.addToDay(-1); }
  }

  public void close()
  {
    if ( changedEntry )
    {
      String toDaysMessage = view.getTodaysMessage();
      diary.saveMessageForToday( toDaysMessage );
      changedEntry = false;
    }
    diary.close();
  }

}
