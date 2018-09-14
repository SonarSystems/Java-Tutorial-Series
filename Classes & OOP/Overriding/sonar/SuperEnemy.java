package sonar;

public class SuperEnemy extends Character
{
	public SuperEnemy()
	{
		this.health = 1000;
	}
	
	public void ReduceHealth(int damage)
	{
		//super.ReduceHealth(damage);
		health -= damage * 2;
	}
}
