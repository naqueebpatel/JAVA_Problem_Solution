import java.util.Scanner;
class Count
{
	static int cnt=0;
	
	public Count()
	{
		cnt++;
	} 
	static void ObjCount()
	{
	   System.out.println("TOTAL OBJECTS:::"+Count.cnt);
	} 
}
public class slip14q1
{
	public static void main(String args[])
	{
		Count obj1=new Count();
		Count obj2=new Count();
		Count obj3=new Count();
		Count.ObjCount();
	}
}
		

		 