package sonar;

class Character
{
	public int lives = 1;
	public float health = 100;
	
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
}

public class Enemy extends Character
{
	public Enemy()
	{
		System.out.println("Constructed");
	}
	
	public Enemy(int i)
	{
		lives = i;
	}
	
}

