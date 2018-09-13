package sonar;

public class Enemy
{
	public int lives = 1;
	public float health = 100;
	
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
}
