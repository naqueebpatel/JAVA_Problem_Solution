import java.util.*;
class Product
{
	int id;
	String name;
	double price;
	Scanner in=new Scanner(System.in);
    public void accept()
	{
		System.out.println("ENTER PRODUCT ID");
		id=in.nextInt();
		System.out.println("ENTER PRODUCT NAME");
		name=in.next();
		System.out.println("ENTER PRODUCT PRICE");
		price=in.nextDouble();
	}
	public void display()
	{
		System.out.println("PRODUCT ID:::"+id);
		System.out.println("PRODUCT NAME:::"+name);
		System.out.println("PRODUCT PRICE:::"+price);
	}
}
public class ProductMain
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i,x=0;
		double min=0;
		System.out.println("ENTER NO OF DETAILS?");
		n=in.nextInt();
		Product obj[]=new Product[n];
		for(i=0;i<n;i++)
		{
			obj[i]=new Product();
			obj[i].accept();
		}
		for(i=0;i<n;i++)
		{
			obj[i].display();
		}
		min=obj[0].price;
		for(i=0;i<n;i++)
		{
			if(obj[i].price<min)
			{
				min=obj[i].price;
				x=i;
			}
		}
		System.out.println("PRODUCT WITH MINIMUM PRICE IS:::"+obj[x].name);
	}
}