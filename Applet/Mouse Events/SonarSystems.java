import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SonarSystems extends Applet implements KeyListener, MouseListener
{
	public void init()
	{
		addKeyListener(this);
		addMouseListener(this);
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

	@Override
	public void mouseClicked(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		
		System.out.println(x + " : " + y);
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		
	}
}