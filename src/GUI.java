import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI{
	public static void main(String args[]){
		ButtonFrame frame = new ButtonFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class ButtonFrame extends JFrame{
	public ButtonFrame(){
		//frame properties
		setTitle("Lab 9");
		setBounds(200,200,200,110);
				
		//contents of frame
		JPanel center = new JPanel();
		JPanel south = new JPanel(new GridLayout(1,4));
		JButton a = new JButton("A");
		JButton b = new JButton("B");
		JButton c = new JButton("C");
		JButton d = new JButton("D");
		textField = new JTextField();
		label = new JLabel();
		
		//adding contents to panels & panels to frame
		south.add(a);
		south.add(b);
		south.add(c);
		south.add(d);
		center.add(label);
		add(textField,"North");
		add(center,"Center");
		add(south,"South");
		
		//action listeners
		ButtonAction aE = new ButtonAction("A");
		ButtonAction bE = new ButtonAction("B");
		ButtonAction cE = new ButtonAction("C");
		ButtonAction dE = new ButtonAction("D");
		
		//adding action listeners to event sources
		a.addActionListener(aE);
		b.addActionListener(bE);
		c.addActionListener(cE);
		d.addActionListener(dE);
	}
	
	private class ButtonAction implements ActionListener{
		//constructor
		public ButtonAction(String c){
			this.c = c;
		}
		
		//actionPerformed
		public void actionPerformed(ActionEvent event){
			count++;
			textField.setText(textField.getText()+c);
			label.setText("Clicks: "+String.valueOf(count));
		}
		
		private String c;
	}
	
	private JTextField textField;
	private JLabel label;
	private int count=0;
}



	
	
	
	
	
	
	
	
	
