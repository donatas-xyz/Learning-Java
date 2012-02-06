import java.io.IOException;
public class TryEnumeration {
	enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
	public static void main(String[] args)
	{
		Day yesterday = Day.Thursday;
		Day today = Day.Friday;
		Day tomorrow = Day.Saturday;
		
		System.out.println("Today is " + today);
		System.out.println("Tomorrow will be " + tomorrow);
		System.out.println("Yesterday was " + yesterday);
		
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