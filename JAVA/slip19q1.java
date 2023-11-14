import javax.swing.*;
import java.awt.*;
public class slip19q1 extends JFrame
{
	slip19q1()
	{
		Color c=JColorChooser.showDialog(null,"Select colour",Color.red);
		getContentPane().setBackground(c);
		
		setTitle("Colour");
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new slip19q1();
	}
}