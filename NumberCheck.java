import java.io.IOException;
public class NumberCheck {
	public static void main(String[] args)
	{
		int number = 0;
		number = 1 + (int)(100*Math.random());
		if(number%2 == 0)
		{
			System.out.println("You have got an even number, " + number);
		}
		else
		{
			System.out.println("You have got an odd number, " + number);
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