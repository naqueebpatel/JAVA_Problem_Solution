import java.util.*;
public class Fac
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num,fac=1;
		System.out.println("ENTER NUMBER TO FIND FACTORIAL");
		num=in.nextInt();
		for(i=0;i<=num;i++)
		{
			fac=fac*i;
		}
		System.out.println("FACTORIAL:::"+fac);
	}
}