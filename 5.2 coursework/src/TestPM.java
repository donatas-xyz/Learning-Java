class TestPM // Tests ProcessMoney class. Please NOTE, that many different approaches may be used to get the machine to work!
{ 
  private static ProcessMoney pm = new ProcessMoney();

  public static void main( String args[] )
  {
    int res = 0, expected = 100;

    test( "setTicketPrice() & getTicketPrice() ");

    pm.setTicketPrice( expected );
    res = pm.getTicketPrice();
    check( res == expected, 
          "Ticket price is %d should be %d", res, expected );

    expected = 200;
    pm.setTicketPrice( expected );
    res = pm.getTicketPrice();
    check( res == expected, 
          "Ticket price is %d should be %d", res, expected );
    
    test( "add() & getPaidSoFar()");

    pm.add( 10 ); pm.add( 20 ); pm.add( 30 );
    expected = 60;
    res = pm.getPaidSoFar();
    check( res == expected, 
          "Money entered into machine is %d should be %d", res, expected );
    pm.add( 20 ); pm.add( 40 ); pm.add( 40 );
    expected = 160;
    res = pm.getPaidSoFar();
    check( res == expected, 
          "Money entered into machine is %d should be %d", res, expected );
    
    test( "add() & cancel()");

    pm.add( 10 ); pm.add( 20 ); pm.add( 30 );
    expected = 0;
    pm.cancel();
    res = pm.getPaidSoFar();
    check( res == expected, 
          "money entered into machine is now %d should be 0", res );

    pm.add( 100 ); pm.add( 200 ); pm.add( 300 );
    expected = 0;
    pm.cancel();
    res = pm.getPaidSoFar();
    check( res == expected, 
          "money entered into machine is now %d should be 0", res );

    test( "enough()");

    pm.setTicketPrice( 200 );
    pm.add( 100 ); pm.add( 100 ); pm.add( 0 );
    expected = 200;
    check( pm.enough(), 
          "Enough money entered into machine 200 for 200 ticket" );
    pm.cancel();

    pm.setTicketPrice( 210 );
    pm.add( 100 ); pm.add( 100 ); pm.add( 20 );
    expected = 200;
    check( pm.enough(), 
          "Enough money entered into machine 220 for 210 ticket" );
    pm.cancel();

    test( "bought() & moneyInMachine()");

    pm.setTicketPrice( 200 );
    pm.add( 100 ); pm.add( 100 ); pm.add( 0 );
    if ( pm.enough() )
    {
      pm.bought();
    }
    
    expected = 200;
    res = pm.moneyInMachine();
    check( expected == res,
          "Total money in machine %d should be %d", res, expected );
    res = pm.getPaidSoFar();
    check( res == 0, 
          "Money for ticket in machine is %d should be 0", res );
    pm.cancel();
    

    pm.setTicketPrice( 200 );
    pm.add( 100 ); pm.add( 100 ); pm.add( 10 );
    if ( pm.enough() )
    {
      pm.bought();
    }

    expected = 410;
    res = pm.moneyInMachine();
    check( expected == res,
          "Total money in machine %d should be %d", res, expected );
    res = pm.getPaidSoFar();
    check( res == 0, 
          "Money for ticket in machine is %d should be 0", res );

    test("Count coins");
    pm = new ProcessMoney();
    checkRecord( 10, 2 );
    checkRecord( 20, 4 );
    checkRecord( 50, 3 );
    checkRecord( 100, 3 );
    checkRecord( 200, 2 );

    System.out.println( "Success" );
  }

  private static void checkRecord( int coin, int howMany )
  {
     pm.setTicketPrice( howMany * coin );

     for ( int i=1; i<=howMany*2; i++ )
     {
       pm.add( coin );
     }
     pm.cancel();

     for ( int i=1; i<=howMany; i++ )
     {
       pm.add( coin );
     }

     pm.bought();
     int actual = pm.getCoins( coin );
     check( howMany == actual,
            "Expected %d - %dp coins found %d - %dp coins", 
             howMany, coin, actual, coin  );
  }

  private static String what = "";

  public static void check( boolean ok, String fmt, Object... params )
  {
    if ( ! ok )
    {
      System.out.println( what );
      System.out.print("ERROR: " );
      System.out.printf( fmt, params );
      System.out.println();
      System.exit(-1);
    }
  }

  public static void test( String str )
  {
    what = "Test: "  + str;
  }
  
}