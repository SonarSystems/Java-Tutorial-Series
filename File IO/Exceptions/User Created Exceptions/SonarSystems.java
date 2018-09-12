
class MyException extends Exception
{
	String str1;
	
	MyException(String str2)
	{
		str1 = str2;
	}
	
	public String toString()
	{
		return ("MyException was triggered: " + str1);
	}
}

public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try
		{
			throw new MyException("This is the my custom error message");
		}
		catch (MyException error)
		{
			System.out.println(error);
		}
	}
	
}