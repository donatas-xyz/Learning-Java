import java.io.IOException;

public class JoinStrings {

public static void main(String[] args) {
	String firstString = "Many ";
	String secondString = "hands ";
	String thirdString = " make work light";
	
	String myString;
	
	myString = firstString + secondString + thirdString;
	System.out.println(myString);
	
	int numHands = 99;
	myString = numHands + " " + secondString + thirdString;
	System.out.println(myString);
	
	myString = "fifty five is " + 5 + 5;
	System.out.println(myString);
	
	myString = 5 + 5 + " is ten";
	System.out.println(myString);
	
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