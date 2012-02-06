import java.io.IOException;
public class PondRadius {
	public static void main(String[] args)
	{
		int fishCount = 20;
		int fishLength = 10;
		int lengthPerSqFt = 2;
		double radius = 0.0;
		
		int feet = 0;
		int inches = 0;
		
		double pondArea = (double)(fishCount*fishLength)/lengthPerSqFt;
		radius = Math.sqrt(pondArea/Math.PI);
		feet = (int)Math.floor(radius);
		inches = (int)Math.round(12.0*(radius-feet));
		
		System.out.println("To hold " + fishCount + " fish averaging " + fishLength +
							" inches long you need a pond with an area of \n" +
							pondArea + " square feet.");
		System.out.println("The radius of a pond with area " + pondArea +
							" square feet is " +
							feet + " feet " + inches + " inches");
		
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