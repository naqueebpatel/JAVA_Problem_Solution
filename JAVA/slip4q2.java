import java.util.*;
class Employee
{
	int id;
	String name;
	double sal;
	Scanner in=new Scanner(System.in);
	Employee()
	{
		System.out.println("ENTER EMPLOYEE ID");
		id=in.nextInt();
		System.out.println("ENTER EMPLOYEE NAME");
		name=in.next();
		System.out.println("ENTER EMPLOYEE SALARY");
		sal=in.nextDouble();
	}
	public void Display()
	{
		System.out.println("EMPLOYEE ID:::"+id);
		System.out.println("EMPLOYEE NAME:::"+name);
		System.out.println("EMPLOYEE SALARY:::"+sal);
	}
}
public class EmpMain
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i,x=0;
		double max=0;
		System.out.println("ENTER NO OF DETAILS");
		n=in.nextInt();
		Employee obj[]=new Employee[n];
		for(i=0;i<n;i++)
		{
			obj[i]=new Employee();
		}
		for(i=0;i<n;i++)
		{
			obj[i].Display();
			if(obj[i].sal>max)
			{
				max=obj[i].sal;
				x=i;
			}
		}
		System.out.println("MAXIMUM SALARY");
	    obj[x].Display();
	}
}