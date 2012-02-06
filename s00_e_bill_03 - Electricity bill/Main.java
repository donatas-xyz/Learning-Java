class Main
{
  public static void main( String args[] )
  {
      System.out.print("#Cost per kilowatt hour (pence): ");
      double pricePerKilowatt = BIO.getDouble();
      
      System.out.print("#Enter customer ID: ");
      int custID = BIO.getInt();
      
      while ( custID > 0 )
      {
          System.out.print("#Enter previous meter reading: ");
          double previous = BIO.getDouble();
          
          System.out.print("#Enter current meter reading:   ");
          double current = BIO.getDouble();
          
          double used = current - previous;
          double bill = pricePerKilowatt/100.0 * used;
          
          System.out.printf("Customer [%8d] ", custID);
          if ( bill > 0.0 )
          {
              System.out.printf(" Meter now %8.1f last %8.1f \n",
                                 current, previous );
              System.out.printf("Units used %8.1f ", used );
              System.out.printf("amount now due (GBP) %8.2f", bill);
          } else {
              if ( bill < 0.0 )
              {
                  System.out.printf(" Refund of (GBP %8.2f)",
                                     -bill );
              }
              if ( bill == 0.0 )
              {
                  System.out.printf(" No charge" );
              }
          }
          System.out.println();
          System.out.println();
          
          System.out.print("#Enter customer ID:           " );
          custID = BIO.getInt();
      }
  }


}