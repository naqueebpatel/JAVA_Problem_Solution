import java.util.*;
class AgeException extends Exception
{
	String emsg;
	AgeException(){}
	AgeException(String emsg)
	{
		this.emsg=emsg;
	}
	public String toString()
	{
		return emsg;
	}
}
class Student
{
	int rno,age;
	String name,cr;
	Student(){}
	Student(int rno,String name,int age,String cr)
	{
		this.rno=rno;
		this.name=name;
		this.age=age;
		this.cr=cr;
	}
	public void Display()
	{
		System.out.println("ROLL NO:::"+rno);
		System.out.println("NAME:::"+name);
		System.out.println("AGE:::"+age);
		System.out.println("COURSE:::"+cr);
	}
}
public class slip6q2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int size,i,y=0;
		int rno,age;
		String name,cr;
		System.out.println("ENTER NO OF DETAILS");
		size=in.nextInt();
		Student obj[]=new Student[size];
		for (i=0;i<size;i++)
		{
			try
			{		
			System.out.println("ENTER ROLL NO:::");
			rno=in.nextInt();
			System.out.println("ENTER NAME:::");
			name=in.next();
			System.out.println("ENTER AGE:::");
			age=in.nextInt();
			if (age<15 || age>21)
				throw new AgeException();
			System.out.println("ENTER COURSE:::");
			cr=in.next();
			obj[i]=new Student(rno,name,age,cr);
			y++;
			}
			catch(AgeException ae)
			{
				System.out.println("AGE IS NOT WITHIN RANGE");
				break;
			}
		}
		for(i=0;i<y;i++)
		{
			obj[i].Display();
		}
	}
}