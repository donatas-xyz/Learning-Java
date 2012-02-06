class Main
{
  public static void main( String args[] )
  {
    Account mike    = new Account();
    Account corinna = new Account();

    double obtained;

    System.out.printf( "Mike's Balance      = %10.2f\n",
                        mike.getBalance() );

    mike.deposit(100.00);
    System.out.printf( "Mike's Balance      = %10.2f\n",
                        mike.getBalance() );

    obtained = mike.withdraw(20.00);
    System.out.printf( "Mike has withdrawn  : %10.2f\n", obtained );
    System.out.printf( "Mike's Balance      = %10.2f\n",
                        mike.getBalance() );

    corinna.deposit(50.00);
    System.out.printf( "Corinna's Balance   = %10.2f\n",
                        corinna.getBalance() );
  }
}


// The class Account 

class Account
{
  private double theBalance    = 0.00;   // Balance of account 
  private double theOverdraft  = 0.00;   // Overdraft allowed 

  public double getBalance()
  {
    return theBalance;
  }

  public double withdraw( final double money )
  {
    assert money >= 0.00;
    if ( theBalance - money >= theOverdraft )
    {
      theBalance = theBalance - money;
      return money;
    } else {
      return 0.00;
    }
  }

  public void deposit( final double money )
  {
    assert money >= 0.00;
    theBalance = theBalance + money;
  }


  public void setOverdraft( final double money )
  {
    theOverdraft = money;
  }

  public double getOverdraftLimit()
  {
    return theOverdraft;
  }
}
