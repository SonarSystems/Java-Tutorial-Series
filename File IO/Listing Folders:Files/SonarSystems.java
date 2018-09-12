import java.io.File;

public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		File f = null;
		
		String paths[];
		
		f = new File("/Applications");
		
		paths = f.list();
		
		for (String p: paths)
		{
			System.out.println(p);
		}
	}
	
}
