import java.io.IOException;

public class FruitAvg {
	public static void main(String[] args)
	{
		double numOranges = 50.0E-1;
		double numApples = 1.0E1;
		double avgFruit = 0.0;
		
		avgFruit = (numOranges + numApples)/2.0;
		
		System.out.println("Calculate fruits");
		System.out.println("Average of fruits: " + avgFruit);
		
		System.out.println("(Press ENTER to leave)");
		
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