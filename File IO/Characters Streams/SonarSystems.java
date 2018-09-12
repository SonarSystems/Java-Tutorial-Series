import java.io.*;

public class SonarSystems {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		FileReader input = null;
		
		input = new FileReader("FileInput.txt");
		
		int number;
		
		while ((number = input.read()) != -1)
		{
			System.out.println(number);
		}
		
		FileWriter output = null;
		
		output = new FileWriter("Awesome.txt");
		
		output.write(65);
		output.write(66);
	}
	
}
