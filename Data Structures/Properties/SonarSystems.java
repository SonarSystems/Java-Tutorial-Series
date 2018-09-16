import java.util.*;

public class SonarSystems {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Properties films = new Properties();
		
		films.put("Star Wars", "Return of the Jedi");
		films.put("Batman", "The Dark Knight Rises");
		films.put("Lord of the Rings", "The Two Towers");
		
		System.out.println(films);
		System.out.println(films.get("Star Wars"));
		
		Iterator i = films.keySet().iterator();
		
		while (i.hasNext())
		{
			String s = (String)i.next();
			System.out.println(s + " : " + films.get(s));
		}
	}
}