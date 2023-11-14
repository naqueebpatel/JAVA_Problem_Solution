public class slip1q1
{
	public static void main(String args[])
	{
		int i,num,max=0;
		for (i=0;i<args.length;i++)
		{
			num=Integer.parseInt(args[i]);
			if (num>max)
				max=num;
		}
		System.out.println("MAXIMUM:::"+max);
	}
}