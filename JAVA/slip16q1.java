import java.util.*;
public class slip16q1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int size,i,sum=0;
		System.out.println("ENTER THE SIZE OF ARRAY");
		size=in.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("ENTER "+(i+1)+" ELEMENT");
			arr[i]=in.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("THE SUM OF ARRAY:::"+sum);
	}
}
			