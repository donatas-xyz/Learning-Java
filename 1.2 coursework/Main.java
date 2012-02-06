class Main
{
  public static void main( String args[] )
  {
    System.out.print("#Enter your CW Mark   : " );
    int cw = BIO.getInt();                       // CW Mark
    System.out.print("#Enter your Exam Mark : " );
    int exam = BIO.getInt();                     // Exam Mark

    double sum = cw + exam;                      // Sum of both marks
    double average = sum / 2;                    // Final result
    
   System.out.printf( "EX = %-3d", exam );       // Prints out the input of exam mark
   System.out.printf( "CW = %-3d", cw );         // Prints out the input of coursework mark
   System.out.printf( "Mark = %4.1f", average ); // Prints out the average of both marks - final result    
   }

}
