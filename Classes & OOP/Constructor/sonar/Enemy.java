package sonar;

public class Enemy
{
	public int lives = 1;
	public float health = 100;
	
	public Enemy()
	{
		System.out.println("Constructed");
	}
	
	public Enemy(int i)
	{
		lives = i;
	}
	
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
	
}
