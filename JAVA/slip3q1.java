import java.util.*;
public class SumDigi
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num,sum=0,rem;
		System.out.println("ENTER NUMBER");
		num=in.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("SUM OF DIGITS:::"+sum);
	}
}