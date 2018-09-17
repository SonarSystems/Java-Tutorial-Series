import java.util.*;

public class SonarSystems {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Set<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(23);
		numbers.add(7);
		numbers.add(90);
		numbers.add(-5);
		numbers.add(90);
		numbers.add(67);
		
		System.out.println(numbers);
		
		TreeSet tree = new TreeSet<Integer>(numbers);
		System.out.println(tree);		
	}
}