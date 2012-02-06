import java.io.IOException;

public class ConditionalOp {
public static void main(String[] args) {
	int nHats = 1;
	System.out.println("I have " + nHats + " hat" + (nHats == 1 ? "." : "s."));
	
	nHats++;
	System.out.println("I have " + nHats + " hat" + (nHats == 1 ? "." : "s."));
	
		try 
		{
		System.in.read();
		}
		catch (IOException e)
		{
		return;
		}
	}
}