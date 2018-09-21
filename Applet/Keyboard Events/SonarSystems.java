import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SonarSystems extends Applet implements KeyListener
{
	public void init()
	{
		addKeyListener(this);
	}
	
	public void start()
	{
		
	}
	
	public void stop()
	{
		
	}
	
	public void destroy()
	{
		
	}
	
	public void paint(Graphics grph)
	{
		grph.drawString("I am Frahaan", 100, 67);
	}
	
	public void keyPressed(KeyEvent event)
	{
		
	}
	
	public void keyReleased(KeyEvent event)
	{
		
	}
	
	public void keyTyped(KeyEvent event)
	{
		char ch = event.getKeyChar();
		
		System.out.println(ch);
		
		//repaint();
	}
}