import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Whiteboard extends JApplet{
		protected int lastx,lasty;
	    public void init(){
	    	setSize(500, 500);
	    	setBackground(Color.WHITE);
	    	addMouseListener(new PositionRecorder());
	     }
	    	protected void recor(int x , int y)
	    	{
	    		
	    		lastx=x;
	    		lasty=y;
	    	}
	    public void paint(Graphics g)
	    {
	    	super.paint(g);
	    	Graphics2D g2=(Graphics2D)g;
	    	g.drawRect(40, 10, 300, 100);
	    	g.drawRect(10, 140, 100, 300);
	    	g.drawRect(150, 140, 100, 300);
	    	g.drawRect(280, 140, 100, 300);
	    }
	    
	    private class PositionRecorder extends MouseAdapter
	    {
	    	public void mousePressed(MouseEvent ev)
	    	{
	    		
	    		recor(ev.getX(),ev.getY());
	    		
	    		if(lastx>=40 && lastx<=340 && lasty<=140)
	    		{
	    			repaint(40,10,300,100);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    		}
	    		else if(lastx>=10 &&lastx<150 && lasty>=140)
	    		{
	    			repaint(10, 140, 100, 300);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    		
	    		}
	    		else if(lastx>=150 &&lastx<280 &&lasty>=140)
	    		{
	    			
	    			repaint(150, 140, 100, 300);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    			
	    		}
	    		else if(lastx>=280 && lasty>=140)
	    		{
	    			repaint(280, 140, 100, 300);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    			
	    		}
	    	}
	    }
}