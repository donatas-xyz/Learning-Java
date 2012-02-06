class Main
{

  public static void main( String args[] )
  {
    System.out.println("Example 10"); Main.main10( args );
    System.out.println("Example 11"); Main.main11( args );
  }

  public static void main10( String args[] ) 
  {
    System.out.println( "        *" );
    System.out.println( "       ***" );
    System.out.println( "      *****" );
    System.out.println( "     *******" );
    System.out.println( "    *********" );
    System.out.println( "   ***********" );
    System.out.println( "  *************" );
    System.out.println( " ***************" );
    System.out.println( "*****************" );
    System.out.println( "       ***" );
    System.out.println( "       ***" );
    System.out.println( "       ***" );
  }


  public static void main11( String args[] )
  {
    int foliageHeight = 20;

    int line = 1;
    while ( line <= foliageHeight )   // For each line of foliage 
    {

      int s = 1;                      // Spaces before foliage 
      while ( s <= foliageHeight-line )
      {
        System.out.print( " " );
        s = s + 1;
      }

      int stars = line*2-1;           // width of foliage segment 
  
      int i = 1;                      //  display foliage segment 
      while ( i <= stars )
      {
        System.out.print( "*" );
        i = i + 1;
      }
      System.out.println();           //  Newline 
  
      line = line + 1;
    }

    int i = 1;                        // Display trunk 
    while ( i <= 3 )
    {
      int s = 1;                      // Spaces before trunk segment 
      while ( s < foliageHeight-1 )
      {
        System.out.print( " " );
        s = s + 1;
      }

      System.out.println( "*******" );    // Trunk segment 

      i = i + 1;
    }
  }


}