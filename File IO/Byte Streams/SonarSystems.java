import java.io.*;

public class SonarSystems {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		FileInputStream input = null;
		
		input = new FileInputStream("FileInput.txt");
		
		int number;
		
		while ((number = input.read()) != -1)
		{
			System.out.println(number);
		}
		
		FileOutputStream output = null;
		
		output = new FileOutputStream("Awesome.txt");
		
		output.write(65);
		output.write(66);
	}
	
}
