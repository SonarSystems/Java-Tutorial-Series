
public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try
		{
			int i = 10 / 1;
		}
		catch (ArithmeticException error)
		{
			System.out.println("Division by zero, very naughty :(");
		}
		finally
		{
			System.out.println("Oh yh, finally");
		}
		
		System.out.println("End");
	}
	
}
