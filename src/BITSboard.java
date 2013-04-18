import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class BITSboard extends JApplet{
		protected int lastx,lasty;
		Image picture;
	    public void init(){
	    	
			String file="bits.jpg";
	    	if(file !=null)
	        {
	    		this.picture=this.getImage(this.getDocumentBase(),file);
	    	}    	
	    	setSize(500, 500);
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
	        	if(this.picture!=null){
	    		g.drawImage(this.picture,0,0,this);
	    	}
	    }
	    
	    private class PositionRecorder extends MouseAdapter
	    {
	    	public void mousePressed(MouseEvent ev)
	    	{
	    		
	    		recor(ev.getX(),ev.getY());
	    		
	    		if(lastx>=330  && lasty>=50 && lasty<=400)
	    		{
	    			repaint(330,80,150,350);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    		}
	    		else if(lastx>=150 && lastx<300 && lasty>=200)
	    		{
	    			repaint(150, 200, 250, 400);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    		
	    		}
	    		
	    		else if(lastx>=165 && lastx<300 && lasty>=90 && lasty<200)
	    		{
	    			repaint(165, 90, 150, 100);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    			
	    		}
	    		else if(lastx>=120 && lastx<300 && lasty>0 && lasty<=120)
	    		{
	    			
	    			repaint(120, 0, 180, 120);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    			
	    		}
	    		else if(lastx>=0&&lastx<120)
	    		{
	    			
	    			repaint(0, 0, 150, 400);
	    			String str=JOptionPane.showInputDialog("Enter the event name: ");
    	    		Graphics g1=getGraphics();
    	    		g1.drawString(str, lastx, lasty);
    	    		g1.fillRect(lastx, lasty, 10, 10);
	    			
	    		}
	    	}
	    }
}