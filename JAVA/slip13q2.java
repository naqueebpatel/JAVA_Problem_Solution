import java.util.*;
class Employee
{
		String name;
		double sal;
		Scanner in=new Scanner(System.in);
		public void accept()
		{
			System.out.println("ENTER NAME");
			name=in.next();
			System.out.println("ENTER SALARY");
			sal=in.nextDouble();
		}
		public void display()
		{
			System.out.println("EMPLOYEE NAME:::"+name);
			System.out.println("EMPLOYEE SALARY:::"+sal);
		}
}
class Developer extends Employee
{
	String pname;
	Scanner in=new Scanner(System.in);
	public void accept()
	{
		super.accept();
		System.out.println("ENTER PROJECT NAME");
		pname=in.next();
	}
	public void display()
	{
		super.display();
		System.out.println("PROJECT NAME:::"+pname);
	}
}
public class slip13q2
{
	public static void main(String args[])
	{
		Developer obj=new Developer();
		obj.accept();
		obj.display();
	}
}
			