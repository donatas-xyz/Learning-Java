/////////////////////////////////////////////////////////////////////
// (C) Michael A Smith 2011-2011 University of Brighton            //
//     http://www.cem.brighton.ac.uk/staff/mas                     //
/////////////////////////////////////////////////////////////////////
// Version automatically created  Thu Oct 13 13:54:06 2011     //
/////////////////////////////////////////////////////////////////////

class Main
{
  public static void main( String args[] )
  {
    System.out.print("#Cost per kilowatt hour       : " );
    double pricePerKilowatt = BIO.getDouble();

    System.out.print("#Enter customer id            : " );
    int    customer = BIO.getInt();
    System.out.print("#Enter previous meter reading : " );
    double previous = BIO.getDouble();
    System.out.print("#Enter current meter reading  : " );
    double current  = BIO.getDouble();

    while ( customer > 0 )
    {
      double used = current - previous;
      double bill = pricePerKilowatt/100.0 * used;

      System.out.printf("Customer [%8d] ", customer);
      System.out.printf(" Meter now %8.1f last %8.1f \n",
                        current, previous );
      System.out.printf("Units used %8.1f  ", used );
      System.out.printf("amount now due (GBP) %8.2f",  bill );

      System.out.println();
      System.out.println();

      System.out.print("#Enter customer id            : " );
      customer = BIO.getInt();
      System.out.print("#Enter previous meter reading : " );
      previous = BIO.getDouble();
      System.out.print("#Enter current meter reading  : " );
      current  = BIO.getDouble();
    }

  }

}
