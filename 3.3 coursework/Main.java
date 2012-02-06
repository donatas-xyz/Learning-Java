class Main
{
  public static void main( String args[] )
  {
    System.out.print( "#Enter the word : " );
    String text2 = BIO.getString();
    String text = text2.toLowerCase();
      
     while ( ! text2.equals( "END" ) )
     {
      char[] textArray = text.toCharArray();
      
      boolean haveSwapped = true;           // Assume not in order 
      outer:
      while ( haveSwapped )                 // Are in order 
      {
       haveSwapped = false;                // Assume in order 
       
       for (char i=0; i<textArray.length-1; i++)
       {                                   // Check pair
         if (textArray[i] > textArray[i+1]){
             System.out.printf("%-10s letters not in ascending order \n", text2);
             break outer;
         }
       }
       System.out.printf("%-10s letters in ascending order \n", text2);
      }
            
      System.out.print( "#Enter the word : " );
      text2 = BIO.getString();
      text = text2.toLowerCase();
    }
  }
}