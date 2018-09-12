
public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int array[] = new int[10];
		
		try
		{
			System.out.println(array[10]);
			int i = 10 / 0;
		}
		catch (ArrayIndexOutOfBoundsException error)
		{
			System.out.println("Array Index Error");
			System.out.println(error);
		}
		catch (ArithmeticException error)
		{
			System.out.println("Maths Error");
			System.out.println(error);
		}
		
		System.out.println("End");
	}
	
}
