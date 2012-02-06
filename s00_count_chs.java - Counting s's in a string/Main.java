class Main
{
  public static void main( String args[] )
  {
      System.out.print("#Enter place name : ");
      String place = BIO.getString();
      
      while ( ! place.equals("END"))
      {
          String placeLC = place.toLowerCase();
          
          int count = 0;
          for (int i = 0; i < placeLC.length(); i++ )
          {
              if (placeLC.charAt(i) == 's')
              count++;
          }
          System.out.printf("Number of s's in %s is %d\n",
                             place, count );
          System.out.print("#Enter place name : ");
          place = BIO.getString();
      }
  }


}