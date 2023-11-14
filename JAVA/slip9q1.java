import java.util.*;
public class slip9q1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int size,i,max=0,x;
		System.out.println("ENTER NO OF MEMBERS?");
		size=in.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("ENTER AGE OF MEMBER");
			arr[i]=in.nextInt();
			if(arr[i]>max)
				max=arr[i];	
		}
		System.out.println("OLDEST MEMBER AGE IS:::"+max);
	}
}