
/**
 * Write a description of class Logic here.
 * 
 * @author (your name and student number)
 */

class Logic
{
  private Counter counter = null;
  
  public Logic( Counter aCounter )
  {
    counter = aCounter;
  }

  public long getValue()
  {
    return counter.getValue();
  }
 
  public void process( String button )
  {
    String info = null;
    if ( button.equals( "Inc" ) )
    {
        counter.inc();
    }
    if ( button.equals( "Dec" ) )
    {
        counter.dec();
    }
    if ( button.equals( "Round" ) )
    {
        counter.round();
    }
    if ( button.equals( "+5" ) )
    {
        counter.add5();
    }  
    if ( button.equals( "+10" ) )
    {
        counter.add10();
    }    
    if ( button.equals( "Zero" ) )
    {
        counter.reset();
    }
  }
}
