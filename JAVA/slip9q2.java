import java.util.*;
class Person
{
	int pid,age;
	String pname,gender;
	
	public Person(){}
	public Person(int p,String pn,int a,String g)
	{
		pid=p;
		pname=pn;
		age=a;
		gender=g;
	}
	public String toString()
	{
		return "PID::: "+pid+" NAME::: "+pname+" AGE::: "+age+" GENDER:::"+gender;
	}
}
public class slip9q2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int pid,age,n,i;
	    String pname,gender;
		System.out.println("ENTER THE NO OF DETAILS?");
		n=in.nextInt();
		Person obj[]=new Person[n];
		for(i=0;i<n;i++)
		{
			System.out.println("ENTER THE PERSON ID");
			pid=in.nextInt();
			System.out.println("ENTER THE PERSON NAME");
			pname=in.next();
			System.out.println("ENTER THE PERSON AGE");
			age=in.nextInt();
			System.out.println("ENTER PERSON GENDER");
			gender=in.next();
			obj[i]=new Person(pid,pname,age,gender);
		}
		for(i=0;i<n;i++)
		{
			System.out.println(obj[i]);
		}
	}
}
     	
	