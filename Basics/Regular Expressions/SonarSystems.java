import java.util.regex.*;

public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Pattern pat = Pattern.compile("F......");
		Matcher mat = pat.matcher("Frahaan");
		
		// First method
		boolean result1 = mat.matches();
		
		System.out.println(result1);
		
		// Second method
		boolean result2 = Pattern.compile("F......").matcher("Frahaan").matches();
		
		System.out.println(result2);
		
		// Third method
		boolean result3 = Pattern.matches("F......", "Frahaan");
		
		System.out.println(result3);
	}

}
