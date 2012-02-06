class Main
{
  public static void main( String args[] )
  {
    System.out.print( "#Enter your text : " );
    String text = BIO.getString();

    while ( ! text.equals( "END" ) )
    {
      
      
      int count = 0;
      for ( int i = 0; i < text.length(); i++ )
      {
        if ( text.charAt(i) == ' ' ) 
          count++;  
      }
  
      System.out.printf("[ %d] spaces in \"%s\"\n", 
                       count,  text );
    
    System.out.print( "#Enter your text : " );
    text = BIO.getString();
    }

  }

}
