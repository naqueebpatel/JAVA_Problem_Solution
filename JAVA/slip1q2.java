class MyNumber
{
	private int x;
	MyNumber()   //default
	{
		x=0;
	}
	MyNumber(int x)  //parameterized
	{
		this.x=x;
	}
	public void isEven()
	{
		if(x%2==0)
				System.out.println("NO IS EVEN");
	}
	public void isOdd()
	{
		if(x%2==1||x%2==-1)
				System.out.println("NO IS ODD");
	}
	public void isPositive()
	{
		if(x>0)
				System.out.println("NO IS POSITIVE");
	}
	public void isNegative()
	{
		if(x<0)
				System.out.println("NO IS NEGATIVE");
	}
}
public class NumMain
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		MyNumber obj=new MyNumber(num);
		obj.isEven();
		obj.isOdd();
		obj.isPositive();
		obj.isNegative();
	}
}