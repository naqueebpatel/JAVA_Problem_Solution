import java.util.*;
class ZeroException extends Exception
{
	ZeroException(){}
}
public class Fact1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num,i,fac=1;
		System.out.println("ENTER NUMBER");
		try
		{
		num=in.nextInt();
		if(num==0)
			throw new ZeroException();
		else
			for(i=1;i<=num;i++)
			{
				fac=fac*i;
			}
			System.out.println("FACTORIAL:::"+fac);
		}
		catch(ZeroException ze)
		{
			System.out.println("NUMBER CANNOT BE ZERO");
		}
	}
}