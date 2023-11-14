import javax.swing.*;
import java.awt.*;
class DemoGUI extends JFrame
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	DemoGUI()
	{
		l1=new JLabel("ENTER USERNAME");
		l2=new JLabel("ENTER PASSWORD");
		t1=new JTextField();
		t2=new JPasswordField();
		b1=new JButton("LOGIN");
		b2=new JButton("REGISTER");
		
		setLayout(null);
		l1.setBounds(20,30,140,20); 
		t1.setBounds(180,30,140,20);
		l2.setBounds(20,80,140,20);
		t2.setBounds(180,80,140,20);
		b1.setBounds(20,140,100,20);
		b2.setBounds(220,140,100,20);
		

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		
		setTitle("DEMO APPLICATION");
		setVisible(true);
		setSize(400,200);
	}
}
public class slip17q2
{
	public static void main(String args[])
	{
		new DemoGUI();
	}
}