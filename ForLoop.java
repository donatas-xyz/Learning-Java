import java.io.IOException;

public class ForLoop {
public static void main(String[] args) {
	int limit = 20;
	int sum = 0;
	
	for(int i = 1, j = 0; i <= limit; i++, j++)
	{
		sum += i*j;
	}
	System.out.println("sum = " + sum);
	
	// Another example
	
	for(double radius = 1.0; radius <= 2.0; radius += 0.2)
	{
		System.out.println("radius = " + radius + " area = " + Math.PI*radius*radius);
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