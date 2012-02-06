class Main
{
  public static void main( String args[] )
  {
   System.out.print( "#Student name  : " );                           
   String studentName = BIO.getString();                            
  
   while ( ! studentName.equals( "END" ) )                                      // will terminate data, so can be entered anything but END.
   {
    System.out.print( "#Coursework : " );
    int cw = BIO.getInt();
    System.out.print( "#Exam       : " );
    int ex = BIO.getInt(); 

    double sum = cw + ex;
    double mark = sum / 2;
    
      if (cw >= 30 && ex >= 30 && mark >= 40)                                                    
      {
       System.out.printf("%s [%d,%d] %3.1f %s", studentName, cw, ex, mark, "Pass \n" );                 
      }
      if (cw >= 30 && ex >= 30 && mark < 40)                                                    
      {
       System.out.printf("%s [%d,%d] %3.1f %s", studentName, cw, ex, mark, "Fail \n" );                 
      }
      if (cw < 30 && ex < 30 && mark < 40)                                                    
      {
       System.out.printf("%s [%d,%d] %3.1f %s", studentName, cw, ex, mark, "Fail \n" );                 
      }
      if (cw < 30 && ex >= 30 && mark >= 40)                                                    
      {
       System.out.printf("%s [%d,%d] %3.1f %s", studentName, cw, ex, mark, "Fail [Threshold] \n" );                 
      }
      if (cw >= 30 && ex < 30 && mark >= 40)                                                    
      {
       System.out.printf("%s [%d,%d] %3.1f %s", studentName, cw, ex, mark, "Fail [Threshold] \n" );                 
      }      
    System.out.print( "#Student name  : " );
    studentName = BIO.getString();
   }
  }
}
