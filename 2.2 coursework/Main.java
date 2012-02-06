class Main
{
  public static void main( String args[] )
  {
   System.out.print( "#Student name  : " );                           
   String studentName = BIO.getString();                            
  
   while ( ! studentName.equals( "END" ) )                                      // will terminate data, so can be entered anything but END.
   {
    System.out.print( "#Mark          : " );
    int mark = BIO.getInt(); 
      
      if (mark >= 70 && mark <= 100)                                                    // if between 70 and 100, will print student name and result " gains a 1st \n"
      {
       System.out.printf("%s [%d]%s", studentName, mark, " gains a 1st \n" );                 
      }
      if (mark >= 60 && mark <= 69)                                                     // same as above only different variables
      {
       System.out.printf("%s [%d]%s", studentName, mark, " gains a 2.1 \n" );
      }
      if (mark >= 50 && mark <= 59)                                                     // same as above only different variables
      {
       System.out.printf("%s [%d]%s", studentName, mark, " gains a 2.2 \n" );
      }
      if (mark >= 40 && mark <= 49)                                                     // same as above only different variables
      {
       System.out.printf("%s [%d]%s", studentName, mark, " gains a 3rd \n" );
      }
      if (mark >= 0 && mark <= 39)                                                     // same as above only different variables
      {
       System.out.printf("%s [%d]%s", studentName, mark, " fails \n" );
      }      
    System.out.print( "#Student name  : " );                                 // starts loop again by using first input
    studentName = BIO.getString();
   }
  }
}
