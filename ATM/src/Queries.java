
/**
 * BCS C1a
 * Queries.java
 * Purpose: For SQL queries only.
 *
 * @version 0.1 12/05/2012
 * @author Donatas Stonys 11834559
 */
public class Queries {

// *** Variables section *** //	
	
	private String queryCreateTBaccount;
	private String queryAlterTBaccount;
	private String queryRetrieveTBcustomer;
	private String queryCreateTBcustomer;
	private String queryAlterTBcustomer;
	private String queryDropTB;
	private String queryUpdateTBcustomer;
	private String queryUpdateTBaccount;
	private String queryCheckAccountExistence;
	private String queryCheckAccountBalance;
	private String queryDepositAccount;
	private String queryWithdrawAccount;
	
	private String customerName = register.getCustomerName();
	private String customerPassword = register.getCustomerPassword();
	private int customerInitialDeposit = register.getCustomerInitialDeposit();
	private long customerIDEntered = bank.getAcNumber();
	private long customerPasswordEntered = bank.getAcPasswd();
	private long customerDeposit = bank.getDeposit();
	private long customerWithdraw = bank.getWithdraw();
	
	private static Register register = new Register();	// Gets customer registration data from Register class
	private static Bank bank = new Bank(); // Gets user's input from Bank class

// *** Create/alter/drop tables section *** //		
	
	public String getQueryCreateTBaccount() {	// create table "account"
		queryCreateTBaccount = "CREATE TABLE account (accountid SERIAL PRIMARY KEY, balance MONEY)"; // create columns. Any int, long will be converted to monetary value in balance column (ex. 100 -> £100.00). Monetary value is chosen for further developments.
		return queryCreateTBaccount;
	}
	public String getQueryAlterTBaccount() {	// alter table "account" - add a column for foreign key
		queryAlterTBaccount = "ALTER TABLE account ADD COLUMN customeridfr INT REFERENCES customer (customerid)"; // create column of foreign key
		return queryAlterTBaccount;
	}
	
	public String getQueryCreateTBcustomer() {	// create table "customer"
		queryCreateTBcustomer = "CREATE TABLE customer (customerid SERIAL PRIMARY KEY, customername VARCHAR(50), customerpassword VARCHAR(50))"; // create a table
		return queryCreateTBcustomer;
	}
	public String getQueryAlterTBcustomer() {	// alter table "customer" - add a column for foreign key
		queryAlterTBcustomer = "ALTER TABLE customer ADD COLUMN accountidfr INT REFERENCES account (accountid)"; // create column of foreign key
		return queryAlterTBcustomer;
	}

	public String getQueryDropTB() { // drop the table(s)
		queryDropTB = "DROP TABLE account, customer CASCADE";
		return queryDropTB;
	}

// *** Insert values section *** //		
	
	public String getQueryUpdateTBcustomer() {
		queryUpdateTBcustomer = "INSERT INTO customer (customerid, customername, customerpassword) VALUES (DEFAULT, '"+customerName+"', '"+customerPassword+"')"; // populate the table with values
		return queryUpdateTBcustomer;
	}
	
	public String getQueryUpdateTBaccount() {
		queryUpdateTBaccount = "INSERT INTO account (accountid, balance) VALUES (DEFAULT, '"+customerInitialDeposit+"')"; // populate the table with values
		return queryUpdateTBaccount;
	}
	
	public String getQueryDepositAccount() {
		queryDepositAccount = "UPDATE ONLY account SET balance = '"+customerDeposit+"' WHERE account.accountid="+customerIDEntered+""; 
		return queryDepositAccount;
	}
	
	public String getQueryWithdrawAccount() {
		queryWithdrawAccount = "UPDATE ONLY account SET balance = '"+customerWithdraw+"' WHERE account.accountid="+customerIDEntered+""; 
		return queryWithdrawAccount;
	}
	
// *** Retrieve values section *** //		
	
	public String getQueryRetrieveTBcustomer() {
		queryRetrieveTBcustomer = "SELECT customerid, customerpassword, regexp_replace(balance::money::text, '[£,]', '', 'g')::numeric, customername FROM customer LEFT JOIN account ON customer.customerid = account.accountid  WHERE customer.customername='"+customerName+"' AND customer.customerpassword='"+customerPassword+"'"; // retrieve customer data. Monetary value is converted to number.
		return queryRetrieveTBcustomer;
	}
	
	public String getQueryCheckAccountExistence() {
		queryCheckAccountExistence = "SELECT customerid, customername FROM customer WHERE customer.customerid="+customerIDEntered+" AND customer.customerpassword='"+customerPasswordEntered+"'"; 
		return queryCheckAccountExistence;
	}	
	
	public String getQueryCheckAccountBalance() {
		queryCheckAccountBalance = "SELECT regexp_replace(balance::money::text, '[£,]', '', 'g')::numeric FROM account WHERE account.accountid="+customerIDEntered+""; 
		return queryCheckAccountBalance;
	}
	

}
