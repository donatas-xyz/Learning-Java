import java.util.*;
import java.io.*;
import java.lang.*;
 public class Main
{
  public static void main( String args[] )
  {
    // Input section //////////////////////////////////  
     
    System.out.print("#Enter width of the line : ");
    int lineWidth = BIO.getInt();
    
    System.out.print("#Enter the text          : ");
    String text = BIO.getString();

    String textDot = text.replace(' ','.');
    
    // Global variables section ///////////////////////
    
    int numberOfWords = 1;
    int w;
    int count = 0;
 
    // String calculations ////////////////////////////
    
    for (w=0; w < text.length(); w++)
    {
      if(text.charAt(w)==' '){
        numberOfWords += 1;
      }
      if ( text.charAt(w) == ' ' ){
        count++;
      }
    }
    
    // Output section //////////////////////////////////
    
    // System.out.printf("Number of words: %d\n", numberOfWords);
    // System.out.printf("Number of characters: %d\n", text.length());
    // System.out.printf("Number of gaps: %d\n", count );
    // System.out.printf("%s\n", textDot);
    
    String [] lines = wrapText(textDot, lineWidth);
    int numberOfDots = count;
    char [] chars = text.toCharArray();
    String charToString = new String(chars);
    for (int i = 0; i < lines.length; i++) 
    {    
      if ( charToString.charAt(i) == '.' )
      {
        count++;
      }
      System.out.println(lines[i]);
    }
    System.out.println(numberOfDots);
    System.out.println(charToString.length());
    
    // Termination loop /////////////////////////////////
    
    while ( ! text.equals( "END" ) )
    {
      System.out.print( "#Enter the text       : ");
      text = BIO.getString();
    }
  }
  
  static String [] wrapText (String text, int lineWidth){  
    // return empty array for null text  
    if (text == null)  
      return new String [] {};  
    // return text if len is zero or less  
    if (lineWidth <= 0)  
      return new String [] {text};  
    // return text if less than length  
    if (text.length() <= lineWidth)  
      return new String [] {text};  
      char [] chars = text.toCharArray();  
      Vector lines = new Vector();  
      StringBuffer line = new StringBuffer();  
      StringBuffer word = new StringBuffer();
    for (int i = 0; i < chars.length; i++) 
    {    
      word.append(chars[i]);    
      if (chars[i] == '.') {      
        if ((line.length() + word.length()) > lineWidth) 
        {        
         lines.add(line.toString());        
         line.delete(0, line.length());
        }      
        line.append(word);      
        word.delete(0, word.length());    
      }  
    }  
    // handle any extra chars in current word  
    if (word.length() > 0) {    
      if ((line.length() + word.length()) > lineWidth) 
      {      
        lines.add(line.toString());      
        line.delete(0, line.length());    
      }    
      line.append(word);  
    }  
    // handle extra line  
    if (line.length() > 0) 
    {    
      lines.add(line.toString());  
    }  
    String [] ret = new String[lines.size()];  
    int c = 0; // counter  
    for (Enumeration e = lines.elements(); e.hasMoreElements(); c++) 
    {    
      ret[c] = (String) e.nextElement();  
    }  
    return ret;
  }
}