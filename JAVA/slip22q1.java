import java.util.*;
import java.io.*;
public class slip22q1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,sal,i;
		String ename;
		Hashtable h=new Hashtable();
		System.out.println("ENTER NUMBER OF DETAILS?");
		n=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			System.out.println("ENTER SALARY");
			sal=Integer.parseInt(br.readLine());
			System.out.println("ENTER EMPLOYEE NAME");
			ename=br.readLine();
			h.put(sal,ename);
		}
		Enumeration v=h.elements();
		Enumeration k=h.keys();
		while(k.hasMoreElements())
		{
			System.out.println(k.nextElement()+" : "+v.nextElement());
		}
	}
}
			