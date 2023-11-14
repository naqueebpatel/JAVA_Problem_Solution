import javax.swing.*;
import java.awt.*;
class GUI extends JFrame
{
	JLabel l1,l2,l3;
	JComboBox c1,c2;
	JRadioButton r1,r2,r3;
	JTextField t1;
	GUI()
	{
		l1=new JLabel("FONT");
		l2=new JLabel("SIZE");
		l3=new JLabel("STYLE");
		String font[]={"ARIAL","BOLD","ITALIC","UNDERLINED"};
		c1=new JComboBox<>(font);
		String size[]={"10","20","30","40"};
		c2=new JComboBox<>(size);
		r1=new JRadioButton("BOLD");
		r2=new JRadioButton("ITALIC");
		r3=new JRadioButton("UNDERLINE");
		t1=new JTextField();
		
		setLayout(null);
		l1.setBounds(30,30,40,20);
		c1.setBounds(30,60,80,30);
		l2.setBounds(30,90,40,20);
		c2.setBounds(30,120,80,30);
		l3.setBounds(180,30,40,20);
		r1.setBounds(180,60,100,40);
		r2.setBounds(180,100,100,40);
		r3.setBounds(180,140,100,40);
		t1.setBounds(30,180,200,50);
		
		add(l1);
		add(c1);
		add(l2);
		add(c2);
		add(l3);
		add(r1);
		add(r2);
		add(r3);
		add(t1);
		
		setVisible(true);
		setTitle("GUI");
		setSize(300,300);
	}
}
public class slip16q2
{
	public static void main(String args[])
	{
		new GUI();
	}
}
		