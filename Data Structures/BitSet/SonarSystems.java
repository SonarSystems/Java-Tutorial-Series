import java.util.*;

public class SonarSystems {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		BitSet b1 = new BitSet(4);
		BitSet b2 = new BitSet(4);
		
		b1.set(0, true);
		b1.set(1, true);
		b1.set(2, true);
		b1.set(3, true);
		
		b2.set(0, false);
		b2.set(1, true);
		b2.set(2, false);
		b2.set(3, true);
		
		System.out.println("B1:" + b1);
		System.out.println("B2:" + b2);
		
		//b1.and(b2);
		b1.xor(b2);
		
		System.out.println("B1:" + b1);
	}
}