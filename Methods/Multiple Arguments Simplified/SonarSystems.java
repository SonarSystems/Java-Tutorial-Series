
public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		adder(3, 324, 234, 2, 34, 23, 4, 23, 4, 23, 4, 234, 234);
		
	}
	
	/*public static int adder(int num1, int num2, int num3)
	{
		return num1 + num2 + num3;
	}*/
	
	public static void adder(int... numbers)
	{
		if (numbers.length == 0)
		{
			System.out.println("Please pass in information");
			
			return;
		}
		
		int total = 0;
		
		for (int num: numbers)
		{
			total += num;
		}
		
		System.out.println(total);
	}
}
