import java.io.IOException;

public class SequenceStrings {

public static void main(String[] args) {
	String string1 = "A";
	String string2 = "To";
	String string3 = "Z";
	
	String string1Out = "\"" + string1 + "\"";
	String string2Out = "\"" + string2 + "\"";
	String string3Out = "\"" + string3 + "\"";
	
	if(string1.compareTo(string3) < 0)
	{
		System.out.println(string1Out + " is less than " + string3Out);
	}
	else
	{
		if(string1.compareTo(string3) > 0)
		{
			System.out.println(string1Out + " is greater than " + string3Out);
		}
		else
		{
			System.out.println(string1Out + " is equal to " + string3Out);
		}
	}
	
	if(string2.compareTo(string1) < 0)
	{
		System.out.println(string2Out + " is less than " + string1Out);
	}
	else
	{
		if(string2.compareTo(string1) > 0)
		{
			System.out.println(string2Out + " is greater than " + string1Out);
		}
		else
		{
			System.out.println(string2Out + " is equal to " + string1Out);
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