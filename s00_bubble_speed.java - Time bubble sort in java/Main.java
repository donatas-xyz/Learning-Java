import java.util.*;

class Main
{
  public static void main( String args[] )
  {
    int howMany[] = { 10,100,1000, 10000, 100000, 1000000, 10000000 };
    for ( int i=0; i<howMany.length; i++ )
    {
      sort( howMany[ i ] );
    }
  }

  public static void sort( int no)
  {
    int numbers[] = new int[no];          // Array 

    Random ran = new Random();
    for ( int i=0; i<no; i++ )
    {
      numbers[i] = ran.nextInt();
    }

    long startTime = getTimeInMills();
    boolean haveSwapped = true;           // Assume not in order 

    while ( haveSwapped )                 // Are in order 
    {
      haveSwapped = false;                // Assume in order 

      for (int i=0; i<numbers.length-1; i++)
      {                                   // Check pair 
         if ( numbers[i] > numbers[i+1] ) //  Not in order 
         {
           int tmp = numbers[i];          //  Swap 
           numbers[i] = numbers[i+1];
           numbers[i+1] = tmp;
           haveSwapped = true;            //  record not in order 
         }
      }                                   // End pass 
    }
    long took = getTimeInMills() - startTime;

    System.out.printf( "%-10d numbers took %10.3f seconds\n",
                       no, (double) took/1000 );
  }

  public static long getTimeInMills()
  {
    Date now = new Date();
    return now.getTime();
  }
}
