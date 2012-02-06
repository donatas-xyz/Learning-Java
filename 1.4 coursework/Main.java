class Main
{
  public static void main( String args[] )
  {
    System.out.print( "#Size of square: " );
    int squareHeight = BIO.getInt();
    int line = 1;
    
  while ( squareHeight <= 40 )
  {
    while ( line <= squareHeight )
    {

      int starsInWidth = 1; 
      while ( starsInWidth <= squareHeight-line )
      {
        System.out.print( "*" );
        starsInWidth = ++starsInWidth;
      }

      int stars = line;
      int i = 1; 
      while ( i <= stars )
      {
        System.out.print( "*" );
        i = ++i;
      }
      System.out.println(); 
  
      line = ++line;
    }
  }
  }
} 