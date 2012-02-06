class Main
{
  private static String vowel[];
  public static void main( String args[] )
  {
    System.out.print( "#Enter the word : " );
    String word = BIO.getString();

    while ( ! word.equals( "END" ) )
    {
  
      System.out.printf("[%4d] vowels in \"%s\"\n", 
                       numberOfVowels(word, 'a'),  word );

      System.out.print( "#Enter the word : " );
      word = BIO.getString();
    }
  }
  public static int numberOfVowels( String vowel, char c )
  {
    populate();
    vowel = vowel.toLowerCase();
    int count = 0;
    for ( int i = 0; i < vowel.length(); i++ )
    {
      if ( vowel.charAt(i) == 'a' )
        count++; 
      if ( vowel.charAt(i) == 'e' )
        count++; 
      if ( vowel.charAt(i) == 'i' )
        count++; 
      if ( vowel.charAt(i) == 'o' )
        count++; 
      if ( vowel.charAt(i) == 'u' )
        count++; 
    }
    return count;
  }
  public static void populate()
  {
      vowel = new String[5];
      
      vowel[0] = "a";
      vowel[1] = "e";
      vowel[2] = "i";
      vowel[3] = "o";
      vowel[4] = "u";
  }
}

