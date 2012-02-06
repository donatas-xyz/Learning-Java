class Main
{
  public static void main( String args[] )
  {
    System.out.print("# Size of 'square': ");
    int squareSize = BIO.getInt();
   
   if ( squareSize >=4 && squareSize <=40 )                         // Possible range of values
   {
    
    int topRow = 1;                                                 // Top part. We start to work with variaous calculations using value 1.
    while ( topRow <= 1)                                            // Prints row only once
    {
      int i = 1;                                                    // We use this variable for calculations so it is enough to have random name for it.
       while ( i <= squareSize )                                    // Prints * up to input value
       {
        System.out.print( "*" );
        i = i + 1;
       }
      System.out.println();                                         // Starts a new line below after loop is finished
      topRow = topRow + 1;
    }    
    
    
    int middleSection = 1;                                          // Middle part
    while ( middleSection <= squareSize-2 )                         // Repeats printing of lines up to value entered (input), but two sizes less as square has 2 
    {                                                               // borders (top and bottom) so to keep shape of square we need minus them from previous value.
      int i = 1;                      
       while ( i <= 1 )                                             // Prints first star on a row. Can be considered as left border too.
       {
        System.out.print( "*" );
        i = i + 1;
          
        int k = 1;                     
         while ( k <= squareSize-2 )                                // Prints 2 less dots as initial square size value, again, to keep square's shape and let to form borders.
         {                                                          // Loop is being repeated by two times less as initial value
          System.out.print( "." );
          k = k + 1;
         }
        System.out.print( "*" );                                    // Prints star on the end of the line. 
       }
      System.out.println();                                         // Adds new line below
      middleSection = middleSection + 1;
    }

    
    int bottomRow = 1;                                              // Bottom part identical to top one.
    while ( bottomRow <= 1)
    {
      int i = 1;                    
       while ( i <= squareSize )
       {
        System.out.print( "*" );
        i = i + 1;
       }

      bottomRow = bottomRow + 1;
    }
   }                                                                
  }

}
