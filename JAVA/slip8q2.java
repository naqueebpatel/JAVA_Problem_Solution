import javax.swing.*;
import java.awt.*;
class MenuGUI extends JFrame
{
	JMenuBar mb;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;
	JMenu m1,m2,m3;
	MenuGUI()
	{
		mb=new JMenuBar();
		
		m1=new JMenu("FILE");
		mi1=new JMenuItem("SAVE");
		mi2=new JMenuItem("OPEN");
		mi3=new JMenuItem("DELETE");
		
		m2=new JMenu("EDIT");
		mi4=new JMenuItem("RENAME");
		mi5=new JMenuItem("NEW");
		
		m3=new JMenu("VIEW");
		mi6=new JMenuItem("VIEW ALL");
		mi7=new JMenuItem("HIDE");
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		m2.add(mi4);
		m2.add(mi5);
		
		m3.add(mi6);
		m3.add(mi7);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		setJMenuBar(mb);
		setTitle("JMenu Example");
		setSize(300,300);
		setVisible(true);
	}
}
public class slip8q2
{
	public static void main(String args[])
	{
		new MenuGUI();
	}
}