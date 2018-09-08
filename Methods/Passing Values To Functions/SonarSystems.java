
public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Function1(6.5f, 5.0f);
		
		int i = ReturnFunction();
		
		System.out.println(i);
	}

	public static void Function1(float var1, float var2)
	{
		System.out.println(var1 * var2);
	}
	
	public static int ReturnFunction()
	{
		int x = 8;
		return 6 * 2 + x;
	}
}
