package sonar;

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

	@Override
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
	
}

