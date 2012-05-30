
/**
 * BCS C1a
 * Register.java
 * Purpose: Registers new user. Non GUI.
 * Must be run before using ATM front-end (Main class) unless
 * user ID and Password is known to the user.
 * 
 * For testing purposes user ID 9 and password (PIN) 71 can be used.
 *
 * @version 0.1 12/05/2012
 * @author Donatas Stonys 11834559
 */
public class Register {
	
	private static String customerName; //
	private static String customerPassword; // Setters
	private static int customerInitialDeposit; //
	
	private static ConnectPSQL runQueries; // To use the method in ConnectPQSL class which holds instructions of connection and manipulation of database.
	
	   public static void main( String args[] )
	   {
		   
// *** Add a new customer to the system *** //
		   
	       System.out.print("#Enter your name : " );	// User enters his name (used only for reference)
	       customerName = BIO.getString();
	       
	       System.out.print("#Enter your password (digits only): " );	// User sets his password
	       customerPassword = BIO.getString(); // Formated as string for more complex passwords in further developments
	       
	       
	       if(checkPassword()) // ... if password was integer
	       {
		       System.out.print("#Define your initial deposit (\u00a3).\n Enter 0 for none : " );	// User tells how much money he puts on account at account opening stage
		       customerInitialDeposit = BIO.getInt(); // Can be int or long as ATM does not allow to enter coins anyway.
	    	   
		       if(customerInitialDeposit == 0) // Checks if customer entered 0
		       { 
		    	   customerInitialDeposit = 0;
			       runQueries = new ConnectPSQL();
			       runQueries.accessDatabaseRunRegisterQueries();	// Calls accessDatabaseRunQueries method from ConnectPSQL class
		       }
		       else
		       {
			       runQueries = new ConnectPSQL();
			       runQueries.accessDatabaseRunRegisterQueries();	// Calls accessDatabaseRunQueries method from ConnectPSQL class
		       }
	       }
	       else
	       {
	    	   while(!checkPassword()) // ... if password wasn't integer
	    	   {
	    		   System.out.print("#Enter your password (digits only): " );
	    		   customerPassword = BIO.getString();
	    	   }
	    	   		
	    	   System.out.print("#Define your initial deposit (\u00a3).\n Enter 0 for none : " );
	    	   customerInitialDeposit = BIO.getInt();
	    	   
		       if(customerInitialDeposit == 0)
		       {
		    	   customerInitialDeposit = 0;
			       runQueries = new ConnectPSQL();
			       runQueries.accessDatabaseRunRegisterQueries();
	   	   
		       }
		       else
		       {
			       runQueries = new ConnectPSQL();
			       runQueries.accessDatabaseRunRegisterQueries();
		       }
	       }
       
    
	   }

	// *** Checks whether user password is integer *** //   
	   public static boolean checkPassword()  
	   {  
	      try  
	      {  
	         Integer.parseInt( customerPassword );
	         return true;  
	      }  
	      catch( Exception e)  
	      {  
	         return false;  
	      }  
	   }  
	   
   // *** Getters *** //
		public String getCustomerName() 
		{
			return customerName;
		}
		
		public String getCustomerPassword() 
		{
			return customerPassword;
		}
		
		public int getCustomerInitialDeposit() 
		{
			return customerInitialDeposit;
		}

}
