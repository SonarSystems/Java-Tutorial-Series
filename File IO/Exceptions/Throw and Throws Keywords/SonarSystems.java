
public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try
		{
			Func();
		}
		catch (ArithmeticException error)
		{
			System.out.println("Arithmetic Exception Triggered, oh yh!");
		}
		
		System.out.println("End!!!");
	}
	
	public static void Func() throws ArithmeticException
	{
		throw new ArithmeticException();
	}
	
}
