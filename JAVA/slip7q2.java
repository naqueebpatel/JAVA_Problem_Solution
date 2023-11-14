import java.util.*;
class Student
{
	int rno;
	String name;
	double per;
	Student()
	{
		rno=0;
		name=" ";
		per=0.0;
	}
	Student(int rno,String name,double per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	public void Display()
	{
		System.out.println("ROLL NO:::"+rno);
		System.out.println("NAME:::"+name);
		System.out.println("PERCENTAGE:::"+per);
	}
}
public class StudMain
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int size,rno,i;
		String name;
		double per;
		System.out.println("ENTER NO OF DETAILS?");
		size=in.nextInt();
		Student obj[]=new Student[size];
		for(i=0;i<size;i++)
		{
			System.out.println("ENTER ROLL NO:::");
			rno=in.nextInt();
			System.out.println("ENTER NAME:::");
			name=in.next();
			System.out.println("ENTER PERCENTAGE:::");
			per=in.nextDouble();
			obj[i]=new Student(rno,name,per);
		}
		for(i=0;i<size;i++)
		{
			obj[i].Display();
		}
	}
}