import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class ComboBox extends JFrame implements ActionListener
{
	JTextField t1;
	JLabel l1;
	JComboBox c1;
	JButton b1;
	ComboBox()
	{
		t1=new JTextField();
		l1=new JLabel("PROGRAMMING LANGUAGE SELECTED");
		String list[]={"C","C++","JAVA","PYTHON","GO","PHP"};
		c1=new JComboBox<>(list);
		b1=new JButton("SHOW");
		
		setLayout(null);
		l1.setBounds(10,50,240,25);
		t1.setBounds(250,50,80,25);
		c1.setBounds(50,120,120,30);
		b1.setBounds(240,120,100,30);
		
		add(l1);
		add(t1);
		add(c1);
		add(b1);
		
		c1.addActionListener(this);
		b1.addActionListener(this);
		
		setTitle("COMBO BOX EXAMPLE");
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText(c1.getSelectedItem()+" ");
		}
	}
}
public class slip21q2
{
	public static void main(String args[])
	{
		new ComboBox();
	}
}
		