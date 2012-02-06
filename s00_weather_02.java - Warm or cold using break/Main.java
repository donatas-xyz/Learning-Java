class Main
{
  public static void main( String args[] )
  {
      int warm = 0;
      int cold = 0;
      
      while (true)
      {
          System.out.print("#Enter place name   : ");
          String place = BIO.getString();
          
          if (place.equals("STOP"))
          break;
          
          System.out.print("#Enter temperature   : ");
          int temp = BIO.getInt();
          
          if (temp >= 20)
          {
              warm = warm + 1;
              System.out.printf("%-15.15s : warm\n", place);
          }
          else
          {
              cold = cold + 1;
              System.out.printf("%-15.15s : cold\n", place);
          }
      }
      System.out.println();
      System.out.printf("Warm places %4d cold places %4d\n",
                         warm, cold);
  }
}