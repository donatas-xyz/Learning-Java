import java.io.IOException;

public class Factorial2 {

public static void main(String[] args) {
	long limit = 20L;
	long factorial = 1L;
	
	OuterLoop:
	for (long i = 1L; i <= limit; i++)
	{
		factorial = 1;
		for (long factor = 2L; factor <= i; factor++)
		{
			if(i > 10L && i % 2L == 1L)
			{
				continue OuterLoop;
			}
			factorial *= factor;
		}
		System.out.println(i + "! is " + factorial);
	}
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