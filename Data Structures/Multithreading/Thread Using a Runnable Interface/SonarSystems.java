import Sonar.ThreadRunnable;

public class SonarSystems {
	   
	public static void main(String [] args)
	{
		ThreadRunnable thr1 = new ThreadRunnable("Awesome thread");
		thr1.start();
		
		
		ThreadRunnable thr2 = new ThreadRunnable("Crazy thread");
		thr2.start();
	}
}