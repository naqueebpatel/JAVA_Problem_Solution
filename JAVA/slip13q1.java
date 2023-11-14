import java.io.*;
class slip13q1
{
	public static void main(String args[]) throws IOException
	{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int arr;
		int i,j,temp=0;
		int arr[]=new int[3];
		for(i=0;i<3;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<3;i++)
		{
			for(j=i+1;j<3;j++)
			{
			 if(arr[i]>arr[j])
			 {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 }
			}
		}
		for(i=0;i<3;i++)
		{
			System.out.println(+arr[i]);
		}
		//int a=Integer.parseInt(args[0]);
		//int b=Integer.parseInt(args[1]);
		//int c=Integer.parseInt(args[2]);
	}
}