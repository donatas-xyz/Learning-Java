class Main
{
  public static void main( String args[] )
  {
    System.out.print("#Enter cost per kilowatt (pence)  : " );
    double pricePerKilowatt = BIO.getDouble();


    System.out.print("#Enter kilowatts used :             " );
    double used = BIO.getDouble();


    while ( used > 0.0 )
    {
      double cost = pricePerKilowatt/100.0 * used;
      System.out.printf("used kilowatts = %6.2f cost GBP = %6.2f\n",
                         used, cost );

      System.out.println();
      System.out.print("#Enter kilowatts used :             " );
      used = BIO.getDouble();
    }

  }

}