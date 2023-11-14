import java.util.*;
public class slip21q1
{
	public static void main(String args[])
	{
		int n,i,num;
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY LIST?");
		n=in.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			System.out.println("ENTER NUMBER TO ADD");
			num=in.nextInt();
			arr.add(num);
		}
		System.out.println(arr);
	}
}
		
			
		