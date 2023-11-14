import java.util.*;
class slip19q2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i,j,temp=0;
		System.out.println("ENTER THE NO. OF FAMILY MEMBERS");
		n=in.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
		System.out.println("ENTER THE AGE OF "+(i+1)+" MEMBER");
		arr[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("THE YOUNGEST MEMBER AGE IS "+arr[0]);
		System.out.println("THE ELDEST MEMBER AGE IS "+arr[n-1]);
	}
}
		