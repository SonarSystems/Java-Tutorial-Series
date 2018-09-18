import java.util.*;

public class SonarSystems {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Enumeration months;
		
		Vector vec = new Vector();
		
		vec.add("January");
		vec.add("February");
		vec.add("March");
		vec.add("April");
		vec.add("May");
		vec.add("June");
		vec.add("July");
		vec.add("August");
		vec.add("September");
		vec.add("October");
		vec.add("November");
		vec.add("December");
		
		months = vec.elements();
		
		while (months.hasMoreElements())
		{
			System.out.println(months.nextElement());
		}
	}
}