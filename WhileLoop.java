import java.io.IOException;

public class WhileLoop {

public static void main(String[] args) {
	int limit = 20;
	int sum = 0;
	int i = 1;
	
	while(i <= limit)
	{
		sum += i++;
	}
	System.out.println("sum = " + sum);
	
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