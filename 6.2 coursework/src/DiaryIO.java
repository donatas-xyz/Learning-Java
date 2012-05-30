import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;


class DiaryIO
{
  public void write( Map<String,String> tm )
  {
    try
    {
      FileOutputStream ostream = new FileOutputStream("diary.dat");
      ObjectOutputStream oos   = new ObjectOutputStream(ostream);

      oos.writeObject( tm );

      oos.flush(); 
      oos.close(); 
      ostream.close();
    }
    catch ( IOException e )
    {
      System.out.println("IOException : " + e.getMessage() );
    }
    catch ( Throwable e )
    {
      System.out.println("FAIL : " + e.getMessage() );
    }
  }

  @SuppressWarnings("unchecked")
  private static
       Map<String,String> readObject( ObjectInputStream in)
           throws java.io.IOException, java.lang.ClassNotFoundException
  {
    return (Map<String,String>) in.readObject();
  }

  public Map<String,String> read()
  {
    try
    {
      FileInputStream istream = new FileInputStream("diary.dat");
      ObjectInputStream   ois = new ObjectInputStream(istream);

      Map <String,String> tm = readObject(ois);

      ois.close(); 
      istream.close(); 
      return tm;
    }
    catch ( Exception e )
    {
      // Failed to read diary, so create an instance of an object  
      //  that implements the map interface 
      return new HashMap< String, String >( 1000 );
    }
  }
}
