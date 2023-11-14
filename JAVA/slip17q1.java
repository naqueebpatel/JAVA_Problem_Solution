import java.util.*;
public class slip17q1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num,i,fac=1;
		System.out.println("ENTER NUMBER?");
		num=in.nextInt();
		if(num==0)
			System.out.println("NUMBER CANNOT BE ZERO");
		else
		{
			for(i=1;i<=num;i++)
				fac=fac*i;
			System.out.println("FACTORIAL :::"+fac);
		}
	}
}
			