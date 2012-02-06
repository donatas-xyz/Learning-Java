public class Main 
{
   public static void charAt_getChars( String args[] )
   {
      System.out.print( "#Enter the word : " );
      String s1 = BIO.getString();
      char charArray[] = new char[ 4 ];

      System.out.printf( "s1: %s ", s1 );

      for ( int count = s1.length() - 1; count >= 0; count-- )
         System.out.printf( "%s ", s1.charAt( count ) );

         // copy characters from string into charArray
         s1.getChars( 0, 4, charArray, 0 );
         System.out.print( "\nThe character array is: " );

      for ( char character : charArray )
         System.out.print( character );
   }
   

   public static void charArrayToString(String[] arg) {
     char[] ch = {'a','b','c','d'};
     System.out.println(String.valueOf(ch));   
   }

   
   public static void charArrayFromStringObject(String[] arg) {
     System.out.print( "#Enter the text : " );
     String text = BIO.getString();
     char[] textArray = text.toCharArray();

     for(char ch: textArray){
       System.out.print(ch);
     }
   }

   public static void stringObjectsFromCharacterArrays(String[] arg) {
     char[] textArray = { 'D', 'o', 'n', 'a', 't', 'a', 's', ' ', 'm', 'a', 'f', 'i', 'a' };
     
     String text = new String(textArray);
     System.out.println(text);
   }
   
   
   public static void getCharsDemo(String args[]) {
     String s = "This is a demo of the getChars method.";
     int start = 10;
     int end = 14;
     char buf[] = new char[end - start];

     s.getChars(start, end, buf, 0);
     System.out.println(buf);
   }
   
    /**
   * Deletes all whitespaces from a String as defined by
   * {@link Character#isWhitespace(char)}.
   *
   * <pre>
   * StringUtils.deleteWhitespace(null)         = null
   * StringUtils.deleteWhitespace("")           = ""
   * StringUtils.deleteWhitespace("abc")        = "abc"
   * StringUtils.deleteWhitespace("   ab  c  ") = "abc"
   * </pre>
   *
   * @param str  the String to delete whitespace from, may be null
   * @return the String without whitespaces, <code>null</code> if null String input
   */
  public static String deleteWhitespace(String str) {
      if (isEmpty(str)) {
          return str;
      }
      int sz = str.length();
      char[] chs = new char[sz];
      int count = 0;
      for (int i = 0; i < sz; i++) {
          if (!Character.isWhitespace(str.charAt(i))) {
              chs[count++] = str.charAt(i);
          }
      }
      if (count == sz) {
          return str;
      }
      return new String(chs, 0, count);
  }
  // Empty checks
  //-----------------------------------------------------------------------
  /**
   * Checks if a String is empty ("") or null.
   *
   * <pre>
   * StringUtils.isEmpty(null)      = true
   * StringUtils.isEmpty("")        = true
   * StringUtils.isEmpty(" ")       = false
   * StringUtils.isEmpty("bob")     = false
   * StringUtils.isEmpty("  bob  ") = false
   * </pre>
   *
   * NOTE: This method changed in Lang version 2.0.
   * It no longer trims the String.
   * That functionality is available in isBlank().
   *
   * @param str  the String to check, may be null
   * @return <code>true</code> if the String is empty or null
   */
  public static boolean isEmpty(String str) {
      return str == null || str.length() == 0;
  }

}