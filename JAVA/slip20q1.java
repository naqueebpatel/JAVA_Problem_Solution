import java.awt.*;
import javax.swing.*;
public class slip20q1 extends JFrame
{
	slip20q1()
	{
		JLabel l1=new JLabel("WELCOMW TO JAVA PRACTICAL");
		add(l1);
		
		JScrollPane sb=new JScrollPane(l1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		add(sb);
		
		setTitle("SCROLL BAR");
		setSize(50,100);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new slip20q1();
	}
}