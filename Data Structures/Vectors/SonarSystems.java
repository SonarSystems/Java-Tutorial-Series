import java.util.*;

public class SonarSystems {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Vector vec = new Vector();
		
		vec.addElement(1); // index 0
		vec.addElement(2); // index 1
		vec.addElement("Hello"); // index 2
		vec.addElement(3); // index 3
		vec.addElement(4); // index 4
		vec.addElement(5); // index 5
		vec.addElement(6); // index 6
		vec.addElement(7); // index 7
		vec.addElement(8); // index 8
		vec.addElement(9); // index 9
		vec.addElement(10); // index 10
		
		//System.out.println(vec);
		//System.out.println(vec.get(0));
		//System.out.println(vec.get(2));
		
		Enumeration e = vec.elements();
		
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}