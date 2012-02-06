import java.io.IOException;

public class FindCharacters {

public static void main(String[] args) {
	String text = "To be or not to be, that is the question;"
				+"Whether 'this nobler in the mind to suffer"
				+" the slings and arrows of outragerous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing and them?";
				
	int andCount = 0;
	int theCount = 0;
	
	int index = -1;
	
	String andStr = "and";
	String theStr = "the";
	
	index = text.indexOf(andStr);
	while(index >= 0)
	{
		++andCount;
		index += andStr.length();
		index = text.indexOf(andStr, index);
	}
	
	index = text.lastIndexOf(theStr);
	while(index >= 0)
	{
		++theCount;
		index -= theStr.length();
		index = text.lastIndexOf(theStr, index);
	}
	System.out.println("The text contains " + andCount + " ands\n"
						+ "The text contains " + theCount + " thes");
	
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