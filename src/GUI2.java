import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class GUI2
{
	public static void main(String args[])
	{
		MultiFrame mf=new MultiFrame();
		mf.setSize(700, 700);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
class MultiFrame extends JFrame
{
	public MultiFrame(){
	setTitle("Lab 9 part b");
	setSize(400,400);
	JPanel north=new JPanel();
	JPanel south=new JPanel();
	JPanel north1=new JPanel();
	JPanel north2=new JPanel();
	JPanel north3=new JPanel();
	JPanel south1=new JPanel();
	JPanel south2=new JPanel();
	JPanel south3=new JPanel();
	JPanel south4=new JPanel();
	JPanel south5=new JPanel();
	String items[]={"Item1","Item2","Item3","Item4"};
	JComboBox cb=new JComboBox(items);
	north.setLayout(new GridLayout(1,4,10,10));
	JTextField tf1=new JTextField(10);
	JTextField tf2=new JTextField(10);
	JTextField tf3=new JTextField(10);
	JTextField tf4=new JTextField(10);
	JLabel l1=new JLabel("First name:");
	JLabel l2=new JLabel("Last name:");
	JLabel l3=new JLabel("Title");
	JLabel l4=new JLabel("Nickname");
	JLabel l5=new JLabel("Format");
	north1.add(l1);
	north1.add(tf1);
	north1.add(l2);
	north1.add(tf2);
	north2.add(l3);
	north2.add(tf3);
	north2.add(l4);
	north2.add(tf4);
	cb.setBackground(Color.white);
	cb.setForeground(Color.black);
	north3.add(l5);
	north3.add(cb);
	north.add(north1,"North");
	north.add(north2,"Center");
	north.add(north3,"South");
	add(north,"North");
	north.setBorder(BorderFactory.createTitledBorder("Name"));
    north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
    JLabel l6=new JLabel("E-mail Address: ");
    JLabel l7=new JLabel("Mail Format: ");
    JButton b1=new JButton("Add");
    JButton b2=new JButton("Edit");
    JButton b3=new JButton("Remove");
    JButton b4=new JButton("As Default");
    JTextField tf5=new JTextField(100);
    String strr[]={"Item1","Item2","Item3","Item4","Item5"};
    JList list=new JList(strr);
    list.setVisibleRowCount( 4 );
    list.setBackground(Color.white);
	list.setForeground(Color.black);
    JRadioButton rb1=new JRadioButton("HTML",false);
    JRadioButton rb2=new JRadioButton("Plain Text",false);
    JRadioButton rb3=new JRadioButton("Custom",true);
    south1.add(l6);
    south1.add(tf5);
    south3.add(b1);
    south2.add(new JScrollPane(list));
    south3.add(b2);
    south3.add(b3);
    south3.add(b4);
    south5.add(l7);
    south4.add(rb1);
    south4.add(rb2);
    south4.add(rb3);
    south.add(south1,"North");
    south.add(south2,"West");
    south.add(south3,"East");
    south.add(south5,"Center");
    south.add(south4,"South");
    add(south,"Center");
    
	south.setBorder(BorderFactory.createTitledBorder("E-mail"));
    south.setLayout(new BoxLayout(south, BoxLayout.Y_AXIS));
	}
}