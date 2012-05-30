
class TestDiary61
{ 
  public static void main( String args[] )
  {
    ModelOfDiary m = new ModelOfDiary();

    for ( int year=2070; year<=2080; year++ )
    {
      for ( int month=1; month<=12; month++ )
      {
        for ( int day=1; day<=28; day++ )
        {
          String key  =  String.format( "%04d-%02d-%02d",
                             year, month, day );
          String message = m.getMessageForToday();
          if ( message == null )
          {
            System.out.printf("FAIL Key <%s>\n" +
                   "     retrieved message for key was <%s>\n" +
                   "     Should have been \"\" as key not in map\n" +
                   "     Did you check for key present in map?\n ",
                   key, message );
            System.exit(-1);
          }
        }
      }
    }

    for ( int year=2000; year<=2012; year++ )
    {
      for ( int month=1; month<=12; month++ )
      {
        for ( int day=1; day<=28; day++ )
        {
          m.setDate( year, month, day );
          String text =  String.format( "%04d-%02d-%02d",
                             year, month, day );
          m.saveMessageForToday( text );
        }
      }
    }

    for ( int year=2000; year<=2012; year++ )
    {
      for ( int month=1; month<=12; month++ )
      {
        for ( int day=1; day<=28; day++ )
        {
          m.setDate( year, month, day );
          String text =  String.format( "%04d-%02d-%02d",
                             year, month, day );
          String today = m.getMessageForToday();
          if ( ! today.equals( text ) )
          {
             System.out.printf("FAIL Date <%s>\n" +
                              "     Stored message was <%s>\n" +
                              "     retrieved message was <%s>\n",
                              text, text, today );
            System.exit(-1);
          }
        }
      }
    }
    System.out.println("Success");
  }
}