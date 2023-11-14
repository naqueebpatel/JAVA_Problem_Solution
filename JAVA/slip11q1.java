import java.util.*;
public class slip11q1
{
public static void main(String args[])
{
 Scanner in=new Scanner(System.in);
 int arr[],n,i,j,temp;
 System.out.println("ENTER THE SIZE OF ARRAY");
 n=in.nextInt();
 arr= new int[n];
 System.out.println("ENTER THE ELEMENT OF ARRAY");
 for(i=0;i<n;i++)
 {
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
 System.out.println("SECOND SMALLEST ELEMENTS IS:::"+arr[1]);
}
}