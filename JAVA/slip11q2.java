import java.util.*;
abstract class shape
{
	abstract void area();
	abstract void volume();
}
class Sphere extends shape
{
	double rad,ar,vol;
	public Sphere()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("ENTER THE RADIIUS OF SPHERE");
	rad=in.nextInt();
	}
	public void area()
	{
		
		ar=4*3.14*rad*rad;
		System.out.println("AREA:::"+ar);
	}
	public void volume()
	{
		vol=(4*3.14*rad*rad*rad)/3;
		System.out.println("VOLUME:::"+vol);
	}
}
public class ass4q1
{
	public static void main(String args[])
	{
		Sphere obj=new Sphere();
		obj.area();
		obj.volume();
	}
}
		