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
      int left = 0;
      int right = textArray.length-1;      
   
      boolean isPalindrome = true;           // Assume not in order 
      outer:
      while ( isPalindrome )                 // Are in order 
      {
       isPalindrome = false;                // Assume in order 
      
       for (left=0; left<right; left++)
       {                                   // Check pair
         if (text.charAt(left) != text.charAt(right)){
             System.out.printf("%-10s is not a palindrome \n", text2);
             break outer;
         }
         right--;
       }
       System.out.printf("%-10s is a palindrome \n", text2);
      }
            
      System.out.print( "#Enter the word : " );
      text2 = BIO.getString();
      text = text2.toLowerCase();
    }
  }
}