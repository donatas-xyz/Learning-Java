
class Test62
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
      for ( int month =1; month<=12; month++ )
      {
        for ( int day = 1; day<=28; day++ )
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
      for ( int month = 1; month<=12; month++ )
      {
        for ( int day = 1; day<=28; day++ )
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

    int monthCheck[][] = { { 2012,  1, 31 },
                           { 2012,  2, 29 },
                           { 2012,  3, 31 },
                           { 2012,  4, 30 },
                           { 2012,  5, 31 },
                           { 2012,  6, 30 },
                           { 2012,  7, 31 },
                           { 2012,  8, 31 },
                           { 2012,  9, 30 },
                           { 2012, 10, 31 },
                           { 2012, 11, 30 },
                           { 2012, 12, 31 },
                           { 2014,  1, 31 },
                           { 2014,  2, 28 },
                           { 2014,  3, 31 },
                           { 2014,  4, 30 },
                           { 2014,  5, 31 },
                           { 2014,  6, 30 },
                           { 2014,  7, 31 },
                           { 2014,  8, 31 },
                           { 2014,  9, 30 },
                           { 2014, 10, 31 },
                           { 2014, 11, 30 },
                           { 2014, 12, 31 },
                           { 2012,  2, 29 },
                           { 2000,  2, 29 },
                           { 2001,  2, 28 },
                           { 2002,  2, 28 },
                           { 2003,  2, 28 },
                           { 2004,  2, 29 },
                           { 1900,  2, 28 },
                           { 1800,  2, 28 },
                           { 1700,  2, 28 },
                           { 1600,  2, 29 },
                           { 2100,  2, 28 }
                        };


    for ( int i=0; i<monthCheck.length; i++ )
    {
      int year  = monthCheck[i][0];
      int month = monthCheck[i][1];
      int days  = monthCheck[i][2];

      int calcDays = m.maxDaysInMonth( year, month );
      if ( calcDays != days )
      {
        System.out.printf("Year %04d month =%02d" +
                          " has %02d days and not %02d days\n",
                          year, month, days, calcDays );
      }
    }
    System.out.println("Success");
  }
}