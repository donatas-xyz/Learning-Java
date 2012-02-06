
/**
 * Write a description of class Main here.
 * 
 * @author (your name and student number)
 */

class Main
{ 
  public static void main( String args[] )
  {
    double pricePerKilo  = 1.20;                // Initial values 
    double kilosOfApples = 5.2;
    double rateUSD = 0.62;
    
    double cost = pricePerKilo * kilosOfApples; // Calculate 
    double costUSD = cost * rateUSD; // Cost in USD

    System.out.print( "Cost of apples is (GBP) " );
    System.out.println( cost );
    
    System.out.print( "Cost of apples in USD " );
    System.out.println( costUSD );
  }

}

