import java.util.*;
public class NumSum
{
	public static void main(String args[])
	{
		int num,i,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		num=in.nextInt();
		for(i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("SUM IS:::"+sum);
	}
}