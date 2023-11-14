class slip10q1
{
	public static void main(String args[])
	{
		int i,len=args.length;
		int arr[]=new int[len];
		for(i=0;i<len;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=len-1;i>=0;i--)
		{
		  System.out.println(+arr[i]);
		}
	}
}