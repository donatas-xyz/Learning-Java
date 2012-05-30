import java.util.ArrayList;

class ProcessMoney {
	
	private int ticketPrice;
	private int paidSoFar;
	private int paidTotal;
	
	ArrayList<Integer> coins = new ArrayList<Integer>(); // An array for coins entered
	ArrayList<Integer> total = new ArrayList<Integer>(); // An array for amounts of coins entered at each purchase
		
	 // Set the price for the current ticket 
	  public void setTicketPrice( int amount ) {
		  ticketPrice = amount;
	  }

	// return the current ticket price 
	  public int getTicketPrice() { 
		  return ticketPrice; 		  
	  }

	  // Add (coin) towards the cost of the ticket 
	  //  this coin is added to the amount credited previously 
	  public void add( int coin ) 
	  {
		  coins.add(coin); // Adds a coin value to the array. Values comes from Logic class try/catch part
	  } 

	  // Has the price of the ticket been 
	  //  "entered into the machine" 
	  public boolean enough() 
	  {
		  getPaidSoFar(); // Invokes getPaidSoFar method to get the value for paidSoFar variable
		  if (paidSoFar >= ticketPrice) // Checks whether amount paid so far is greater or equal to the price of the ticket
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }

	  // return the amount credited so far for the ticket 
	  public int getPaidSoFar() { 

		  paidSoFar = 0; // Sets paidSoFar value to 0 in order to perform correct calculations
		  
		  for (int i=0; i < coins.size(); i++) // Loops through the ArrayList and sums all coins entered so far
		  {
			  paidSoFar = paidSoFar + (coins.get(i));
		  }
		  
		  // System.out.println(paidSoFar);
		  System.out.println(total);
		  // System.out.println(paidTotal);
		  return paidSoFar;
		  
	  }

	  // Cancel the purchase of the ticket 
	  //  "coins are returned" and the  
	  //  amount credited for the ticket purchase is set to 0 
	  public void cancel() 
	  {
		  coins.clear(); // Clears the ArrayList
	  } 

	  // The ticket has been bought 
	  //  add all money for the ticket purchased  
	  //  to the money in the machine 
	  //  amount credited for the ticket purchase is set to 0 
	  public void bought() 
	  {
		  total.add(paidSoFar); // Adds an amount of money entered so far to the ArrayList that holds values for total amount of money in the machine
		  coins.clear(); // Clears the ArrayList
	  }

	  // Return the amount of money in the machine 
	  public int moneyInMachine()
	  {
		  paidTotal = 0;
		  
		  for (int k=0; k < total.size(); k++)
		  {
			  paidTotal = paidTotal + (total.get(k));
		  }
		  return paidTotal;
	  }
}
