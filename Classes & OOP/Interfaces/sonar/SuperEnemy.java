package sonar;

public class SuperEnemy implements Character
{
	private int health = 100;
	
	public SuperEnemy()
	{
		this.setHealth(1000);
	}
	
	public void ReduceHealth(int damage)
	{
		//super.ReduceHealth(damage);
		setHealth(getHealth() - damage * 2);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
