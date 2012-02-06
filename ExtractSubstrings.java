import java.io.IOException;

public class ExtractSubstrings {

public static void main(String[] args) {
	String text = "To be or not to be";
				
	int count = 0;
	char separator = ' ';
	
	int index = 0;
	do 
	{
		++count;
		++index;
		index = text.indexOf(separator, index);
	}
	while (index != -1);
	
	String[] subStr = new String[count];
	index = 0;
	int endIndex = 0;
	for(int i = 0; i < count; i++)
	{
		endIndex = text.indexOf(separator, index);
		
		if(endIndex == -1)
		{
			subStr[i] = text.substring(index);
		}
		else
		{
			subStr[i] = text.substring(index, endIndex);
		}
		index = endIndex + 1;
	}
	
	for(String s : subStr)
	{
		System.out.println(s);
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