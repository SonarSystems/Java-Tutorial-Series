import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SonarSystems {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		      
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		
		String name = reader.readLine( );
		
		System.out.println( name );
	}

}
