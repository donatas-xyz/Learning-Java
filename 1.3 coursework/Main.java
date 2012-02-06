class Main
{
  public static void main( String args[] )
  {
  System.out.print( "#Enter your student number  : " ); 
  int studentID = BIO.getInt();
  
  while ( studentID != 0 )                                      // 0 will terminate data, so can be entered anything but zero.
  {
        System.out.print( "#Enter your CW Mark         : " );
        int cw = BIO.getInt();                                  // "(The mark will always be an integer number between 0 and 100". So I chose int instead of double.
        System.out.print( "#Enter your Exam Mark       : " );
        int exam = BIO.getInt();                                // "(The mark will always be an integer number between 0 and 100". So I chose int instead of double.
      
      double sum = cw + exam;                                   // "One way of implementing this is to use a cast (double) in this calculation to force conversion from an int to a double before you divide by 2"
      double average = sum / 2;                                 // Now sum of both marks can be divided by 2 and correct result will be given
      
      System.out.printf("SN=%8d ", studentID );                 // Student number will always remain 8 characters long, but in case it is shorter correct aligment will still take a place
      System.out.printf("EX=%3d ", exam );                      // To ensure the same aligment for results  
      System.out.printf(" CW=%3d ", cw);                        // containing 1-3 characters
      System.out.printf("Mark=%5.1f", average);                 // Aligment and 1 decimal place 
      
      System.out.println();                                     // Prints two empty lines between each output 
      System.out.println();                                     // to make table look more tidy. 
            
      System.out.print( "#Enter your student number  : " );      // Allows to stop/continue the program/loop. 0 will stop the program.
      studentID = BIO.getInt();
    }
  
   }

}
