package sonar;

public class Enemy
{
	public int lives = 1;
	private float health = 100;
	
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
	
	public void SetHealth(float health)
	{
		this.health = health;
	}
	
	public float GetHealth()
	{
		return health;
	}
}
