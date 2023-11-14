import java.util.*;
public class slip12q1
{
public static void main(String args[])
    {
	Scanner in=new Scanner(System.in);
	int num,i=1,p=0;
	System.out.println("ENTER THE NUMBER TO CHECK");
	num=in.nextInt();
	for(i=1;i<num;i++)
	{
		if(num%i==0)
		{
			p=p+i;
		}
	}
	if(p==num)
	{
	System.out.println("PERFECT NUMBER");
	}
	else
	{
		System.out.println("NOT A PERFECT NUMBER");
	}
	}
}