import java.util.*;
interface Operation
{
	double pi=3.14;
	void area();
	void circumference();
}
class Circle implements Operation
{
	double ar,cir,rad;
	public Circle()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS");
		rad=in.nextInt();
	}
	public void area()
	{
		ar=pi*rad*rad;
		System.out.println("AREA:::"+ar);
	}
	public void circumference()
	{
		cir=2*pi*rad;
		System.out.println("CIRCUMFERENCE:::"+cir);
	}
}
public class slip12q2
{
	public static void main(String args[])
	{
		Circle obj=new Circle();
		obj.area();
		obj.circumference();
	}
}