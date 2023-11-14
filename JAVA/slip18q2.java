import javax.swing.*;
import java.awt.*;
class CustomerGUI extends JFrame
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JButton b1;
	CustomerGUI()
	{
		l1=new JLabel("CUSTOMER ACCOUNT DETAILS");
		l2=new JLabel("NAME OF CUSTOMER");
		l3=new JLabel("NAME OF BANK");
		l4=new JLabel("ACCOUNT NUMBER");
		l5=new JLabel("PAN NUMBER");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		b1=new JButton("SUBMIT");
		
		setLayout(null);
		l1.setBounds(60,20,200,30);
		l2.setBounds(20,60,140,20);
		t1.setBounds(180,60,120,20);
		l3.setBounds(20,90,140,20);
		t2.setBounds(180,90,120,20);
		l4.setBounds(20,120,140,20);
		t3.setBounds(180,120,120,20);
		l5.setBounds(20,150,140,20);
		t4.setBounds(180,150,120,20);
		b1.setBounds(110,180,100,20);
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(b1);
		
		setVisible(true);
		setTitle("CUSTOMER DETAILS");
		setSize(350,250);
	}
}
public class slip18q2
{
	public static void main(String args[])
	{
		new CustomerGUI();
	}
}