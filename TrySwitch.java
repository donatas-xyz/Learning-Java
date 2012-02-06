import java.io.IOException;

public class TrySwitch {
enum WashChoice {cotton, linen, wool, synthetic}

public static void main(String[] args) {

	WashChoice wash = WashChoice.cotton;
	int clothes = 4;
	
	switch(clothes)
	{
		case 1:
			System.out.println("Washing shirts.");
			wash = WashChoice.cotton;
			break;
		case 2:
			System.out.println("Washing sweaters.");
			wash = WashChoice.wool;
			break;
		case 3:
			System.out.println("Washing socks.");
			wash = WashChoice.wool;
			break;
		case 4:
			System.out.println("Washing sheets.");
			wash = WashChoice.linen;
			break;
		case 5:
			System.out.println("Washing pants.");
			wash = WashChoice.synthetic;
			break;
		default:
			System.out.println("Unknown washing - default synthetic.");
			wash = WashChoice.synthetic;
			break;
	}
	System.out.println("Wash is " + wash);
	switch(wash)
	{
		case wool:
		System.out.println("Temperature is 120");
		break;
		case cotton:
		System.out.println("Temperature is 170");
		break;
		case synthetic:
		System.out.println("Temperature is 130");
		break;
		case linen:
		System.out.println("Temperature is 180");
		break;
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