import java.io.IOException;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

public class MorePrimes {

public static void main(String[] args) {
	long[] primes = new long[20];
	primes[0] = 2L;
	primes[1] = 3L;
	int count = 2;
	
	long number = 5L;
	
	outer:
	for( ; count < primes.length; number += 2L)
	{
		long limit = (long)ceil(sqrt((double)number));
		for(int i = 1; i < count && primes[i] <= limit; i++)
		{
			if(number%primes[i] == 0L)
			{
				continue outer;
			}
		}
	primes[count++] = number;
	}
	
	for(long n : primes)
	{
		System.out.println(n);
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