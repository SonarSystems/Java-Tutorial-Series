import sonar.Enemy;

public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Enemy e1 = new Enemy();
		e1.lives = 10;
		
		Enemy e2 = new Enemy();
		
		System.out.println(e1.lives);
		System.out.println(e2.lives);
		
		e2.ReduceHealth(9);
		System.out.println(e1.health);
		System.out.println(e2.health);
	}
}