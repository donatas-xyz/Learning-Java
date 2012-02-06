class Main
{
  public static void main( String args[] )
  {
  System.out.print( "#Student name  : " );                           
  String studentName = BIO.getString();                            
  
  while ( ! studentName.equals( "END" ) )                                      // will terminate data, so can be entered anything but END.
  {
    System.out.print( "#Module Mark   : " );
    int passPoint = BIO.getInt(); 
      
      if (passPoint >= 40)                                                    // if more or equal to 40, will print student name and result "Pass"
      {
       System.out.printf(studentName);
       System.out.printf("%s", " Pass" );                 
     
       System.out.println();                                    
      }
      if (passPoint < 40)                                                     // if less than 40, will print student name and result "Fail"
      {
       System.out.printf(studentName);               
       System.out.printf("%s", " Fail" );
       
       System.out.println();                                     
      }
    System.out.print( "#Student name  : " );                                 // starts loop again by using first input
    studentName = BIO.getString();
  }
  
   }

}
