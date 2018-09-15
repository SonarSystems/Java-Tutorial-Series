import sonar.Character;
import sonar.Enemy;
import sonar.SuperEnemy;

public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		/*Enemy e1 = new Enemy();
		e1.lives = 10;
		
		Enemy e2 = new Enemy();
		
		System.out.println(e1.lives);
		System.out.println(e2.lives);
		
		e2.ReduceHealth(9);
		//System.out.println(e1.health);
		//System.out.println(e2.health);
		
		Enemy e3 = new Enemy(9);
		System.out.println(e3.lives);
		
		System.out.println(e3.health);
		
		SuperEnemy se = new SuperEnemy();
		System.out.println(se.health);*/
		
		Enemy e1 = new Enemy();
		System.out.println(e1.health);
		e1.ReduceHealth(1);
		System.out.println(e1.health);
		
		SuperEnemy se = new SuperEnemy();
		System.out.println(se.health);
		se.ReduceHealth(1);
		System.out.println(se.health);
		
		//Character c1 = new Character();
	}
}