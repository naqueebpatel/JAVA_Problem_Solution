import java.util.*;
public class slip15q1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char ch=' ';
		System.out.println("ENTER THE CHARACTER TO CHECK?");
		ch=in.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println(ch+" IS A VOWEL");
		}
		else
		{
			System.out.println(ch+" IS A CONSTANT");
		}
	}
}		