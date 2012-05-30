
/**
 * BCS C1a
 * Bank.java
 * Purpose: Passes and retrieves values from GUI to ConnectPSQL class.
 *
 * @version 0.1 12/05/2012
 * @author Donatas Stonys 11834559 & Mike Smith
 */
class Bank
{
	private static ConnectPSQL runQueries; // To use the method in ConnectPQSL class which holds instructions of connection and manipulation of database.
	private static long balance;
	private static long accNo;
	private static long accPswd;
	private static long accDep;
	private static long accWD;
	private static String accName;
	
  public static void setAcNumber( long accNumber ) { 
	  accNo = accNumber;
  }
  
  public long getAcNumber(){
	  return accNo;
  }

  public static void setAcPasswd( long accPassword ) { 
	  accPswd = accPassword;
  }
  
  public long getAcPasswd(){
	  return accPswd;
  }

  // Invokes method in ConnectPSQL class which invokes another method on Queries class that executes SQL query and checks
  // user ID and password entered against database records and if record is found then it returns the userID back to Bank class
  // and compares it with account number entered. If they match - returns true, and if not - returns false.
  public boolean checkValid() 
   { 
	  runQueries = new ConnectPSQL();
      ConnectPSQL.accessDatabaseRunBankQueriesCheckValid();	// Calls accessDatabaseRunQueries method from ConnectPSQL class

      long userID = runQueries.getCustomerID();

	  if(accNo == userID)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }

   }

  public boolean withdraw( long amountWD ) 
   { 
	  runQueries = new ConnectPSQL();
      ConnectPSQL.accessDatabaseRunBankQueriesGetBalance(); // Gets balance
      balance = runQueries.getCustomerBalance();
      accWD = balance - amountWD;
      
      if(balance < amountWD)
      {
    	  return false;
      }
      else
      {
    	  ConnectPSQL.accessDatabaseRunBankQueriesWithdraw();	// Updates the table with new balance
    	  return true;  
      }

   }
  public long getWithdraw()
  {
	  return accWD;
  }  
  
  public static void deposit( long amountDep ) 
   { 
	  runQueries = new ConnectPSQL();
      ConnectPSQL.accessDatabaseRunBankQueriesGetBalance(); // Gets balance
      balance = runQueries.getCustomerBalance();
	  accDep = amountDep + balance; // Adds deposit entered to existing balance
      ConnectPSQL.accessDatabaseRunBankQueriesDeposit();	// Updates the table with new balance
   }
  public long getDeposit()
  {
	  return accDep;
  }
  
  public long getBalance() {
	  runQueries = new ConnectPSQL();
      ConnectPSQL.accessDatabaseRunBankQueriesGetBalance();	// Gets current balance
      balance = runQueries.getCustomerBalance();
	  return balance; 
   }
  
  public String getUserName() {
	  runQueries = new ConnectPSQL();
      ConnectPSQL.accessDatabaseRunBankQueriesCheckValid();	// Gets customer's name
      accName = runQueries.getCustomerName();
	  return accName; 
   }
  
}
