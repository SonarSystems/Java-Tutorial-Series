import java.util.*;

public class SonarSystems {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		/*
		 * Hello
		 * 4.9
		 * 3
		 * 2
		 * 1
		 */
		
		// LIFO (Last In First Out)
		Stack stk = new Stack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4.9);
		stk.push("Hello");
		
		System.out.println(stk);
		System.out.println(stk.get(0));
		System.out.println(stk.get(4));
		
		stk.pop();
		stk.pop();
		
		System.out.println(stk);
	}
}