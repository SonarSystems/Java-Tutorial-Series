import java.util.*;

public class SonarSystems {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		SortedSet sorted = new TreeSet();
		
		sorted.add(78);
		sorted.add(98);
		sorted.add(0);
		sorted.add(45);
		sorted.add(1000);
		
		System.out.println(sorted);
		
		Iterator i = sorted.iterator();
		
		while (i.hasNext())
		{
			Object e = i.next();
			System.out.println(e);
		}
	}
}