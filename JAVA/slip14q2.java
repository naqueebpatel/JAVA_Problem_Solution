import java.util.*;
abstract class order
{
	int id;
	String desc;
	abstract void accept();
	abstract void display();
}
class PurchaseOrder extends order
{
	String cname;
	Scanner in=new Scanner(System.in);
	public void accept()
	{
		System.out.println("ENTER ID");
		id=in.nextInt();
		System.out.println("ENTER DESCRIPTION");
		desc=in.next();
		System.out.println("ENTER CUSTOMER NAME");
		cname=in.next();
	}
	public void display()
	{
		System.out.println("ID:::"+id);
		System.out.println("DESCRIPTION:::"+desc);
		System.out.println("CUSTOMER NAME:::"+cname);
	}
}
public class slip14q2
{
	public static void main(String args[])
	{
	 PurchaseOrder obj1=new PurchaseOrder();
	 PurchaseOrder obj2=new PurchaseOrder();
	 PurchaseOrder obj3=new PurchaseOrder();
	 obj1.accept();
	 obj2.accept();
	 obj3.accept();
	 obj1.display();
	 obj2.display();
	 obj3.display();	 
	}
}