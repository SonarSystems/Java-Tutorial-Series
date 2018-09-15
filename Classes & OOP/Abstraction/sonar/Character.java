package sonar;

public abstract class Character
{
	public int lives = 1;
	public float health = 100;
	
	public abstract void ReduceHealth(int damage);
}
