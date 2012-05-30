import javax.swing.JTextArea;

/**
 * BCS C1a
 * Logic.java
 * Purpose: Holds the parameters of GUI and passes values to Bank class 
 * as well as executes methods in Bank class.
 *
 * @version 0.1 12/05/2012
 * @author Mike Smith
 */
class Logic
{
	
  private enum  State { ACCOUNT_NO, PASSWORD, PROCESSING };
  private State state = State.ACCOUNT_NO;
  private long  number;
  private Bank bank = new Bank();
  private String userName;

  private JTextArea display1, display2;
 
  
  public Logic( JTextArea area1, JTextArea area2 )
  {
    display1 = area1; display2 = area2;
    display2.setText( "Welcome: Enter your account number" );
  }
 
  public void process( String button )
  {
      
    if ( button.length() == 1 )
    {
      char c = button.charAt(0);
      if ( c >= '0' && c <= '9' )               // Digit 
      {
        number = number * 10 + c-'0';           // Build number 
        display1.setText( "" + number );
      }
      return;
    }
    
    if ( button.equals( "CLR" ) )
    {
      number = 0;
      display1.setText( "" + number );
    }

    if ( button.equals( "Ent" ) )
    {
      switch ( state )
      {
        case ACCOUNT_NO:
          Bank.setAcNumber( number );
          number = 0;
          state = State.PASSWORD;
          display1.setText( "" );
          display2.setText( "Now enter your password" );
          break;
        case PASSWORD:
          Bank.setAcPasswd( number );
          number = 0;
          display1.setText( "" );
          if ( bank.checkValid() )
          {
        	userName = bank.getUserName();
            state = State.PROCESSING;
            display2.setText( "Hello, "+userName+"! Now enter transaction or check your balance" );
          } else {
            state = State.ACCOUNT_NO;
            display2.setText( "Invalid: Start again" );
          }
          break;
        default :
      }
      return;
    }

    if ( state != State.PROCESSING ) 
    {
      state = State.ACCOUNT_NO;
      display2.setText( "But you are not loged in\n"  );
      display2.append( "Welcome: Enter your account number" );
      return;
    }

    if ( button.equals( "W/D" ) )               // Clear Result 
    {
      display1.setText( "" );
      if ( bank.withdraw( number ) )
      {
        display2.setText( "Withdrawn: \u00a3" + number + ".00" );
      } else {
        display2.setText( "You do not have surficient funds" );
      }
      number = 0;
      return;
    }
    
    if ( button.equals( "Bal" ) )               // Clear Result 
    {
      display2.setText( "Your balance is: \u00a3" + bank.getBalance() + ".00");
      return;
    }
    
    if ( button.equals( "Dep" ) )               // Clear Result 
    {
      Bank.deposit( number );
      display1.setText( "" );
      display2.setText( "Deposited: \u00a3" + number + ".00" );
      number = 0;
      return;
    }
    
    if ( button.equals( "Fin" ) )               // Clear Result 
    {
      state = State.ACCOUNT_NO;
      number = 0;
      display2.setText( "Welcome: Enter your account number" );
      return;
    }
   
    return;
  }

  public long getResult()
  {
    return number;
  }
 
  public long getNumber()
  {
    return number;
  }
  
  public long getPIN()
  {
    return number;
  }
}
