import java.util.*;
public class Reverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num,rem,rev=0;
		System.out.println("ENTER NUMBER TO REVERSE");
		num=in.nextInt();
		while (num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("REVERSE:::"+rev);
	}
}