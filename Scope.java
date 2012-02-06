import java.io.IOException;

public class Scope {
public static void main(String[] args) {
	int outer = 1;
	// System.out.println("inner = " + inner); //Uncomment for error
	
	{
	int inner = 2;
	System.out.println("inner = " + inner);
	System.out.println("outer = " + outer);
	
	// int outer = 5; //Uncomment for error
	}
	
	// System.out.println("inner = " + inner); //Uncomment for error
	int inner = 3;
	System.out.println("inner = " + inner);
	System.out.println("outer = " + outer);
	
	
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