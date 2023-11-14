import java.util.Scanner;
class RollException extends Exception
{
	//String emsg;
	public RollException(){}
	/*public RollException(String emsg)
	{
		this.emsg=emsg;
	}
	public String toString()
	{
		return (emsg);
	}*/
}
class Student
{
	int rno;
	String sname,course;
	double age;
	
	public Student(){}
	public Student(int rno,String sname,double age,String course)
	{
		this.rno=rno;
		this.sname=sname;
		this.age=age;
		this.course=course;
	}
	
	public void display()
	{
		System.out.println("ROLL NO::: "+rno);
		System.out.println("STUDENT NAME::: "+sname);
		System.out.println("AGE::: "+age);
		System.out.println("COURSE::: "+course);
	}
}

public class slip10q2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i,rno=0;
		String sname,course;
	    double age;
		System.out.println("ENTER THE NUMBER OF INPUTS");
		n=in.nextInt();
		Student obj[]=new Student[n];
		for(i=0;i<n;i++)
		{
			try
			{
			System.out.println("ENTER ROLL NO");
			rno=in.nextInt();
			if(rno<=13001||rno>=13080)
				throw new RollException("ROLL NO NOT WITHIN RANGE");
		    }
			catch(RollException re)
			{
				System.out.println(re);
				break;
			}
			System.out.println("ENTER STUDENT NAME");
			sname=in.next();
			System.out.println("ENTER THE AGE");
			age=in.nextDouble();
			System.out.println("ENTER STUDENT COURSE");
			course=in.next();
			obj[i]=new Student(rno,sname,age,course);
		}
		for(i=0;i<n;i++)
		{
			obj[i].display();
		}
	}
}
			
	