import java.io.IOException;
public class Fruit {
	public static void main(String[] args)
	{
		int numOranges = 5;
		int numApples = 10;
		int numFruit = 0;
		
		numFruit = numOranges++ + numApples;
		
		System.out.println("Skai\u010Diuojam vaisius");
		System.out.println("Viso vaisiu: " + numFruit);
		
		System.out.println("(Paspauskite ENTER isejimui)");
		
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