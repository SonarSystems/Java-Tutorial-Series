import java.net.*;
import java.io.*;


public class Client {
	   
	public static void main(String [] args)
	{
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		
		try
		{
			System.out.println("Connecting to " + serverName + " at port number " + port);
			
			Socket client = new Socket(serverName, port);
			
			System.out.println("Just connected to " + client.getRemoteSocketAddress());
			OutputStream out = client.getOutputStream();
			DataOutputStream data = new DataOutputStream(out);
			
			data.writeUTF("Hello from " + client.getLocalSocketAddress());
			InputStream in = client.getInputStream();
			DataInputStream inputS = new DataInputStream(in);
			
			System.out.println("Server says" + inputS.readUTF());
			client.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
	}
}