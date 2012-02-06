import java.io.IOException;

public class FindPrimes {

public static void main(String[] args) {
	int nPrimes = 50;
	
	OuterLoop:
	for(int i = 2; ; i++)
	{
		for(int j = 2; j < i; j++)
		{
			if(i % j == 0)
			{
				continue OuterLoop;
			}
		}
		
		System.out.println(i);
		if(--nPrimes == 0)
		{
			break;
		}
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