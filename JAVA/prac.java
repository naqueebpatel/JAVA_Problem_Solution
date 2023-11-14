abstract class Anonymous
{
	abstract void Display();
}
class prac
{
	public static void main(String args[])
	{
		Anonymous obj=new Anonymous();
		{
			public void Display()
			{
				System.out.println("INSIDE ANONYMOUS CLASS");
			}
		};
		obj.Display();
	}
}