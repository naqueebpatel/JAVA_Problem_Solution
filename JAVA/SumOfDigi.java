import java.util.*;
public class SumOfDigi
{
public static void main(String args[]);
Scanner in=new Scanner(System.in);
num,sum=0,rem;
System.out.println("Enter Number");
num=in.nextInt();
while(num>0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println("Sum Of Digit"+sum);
}