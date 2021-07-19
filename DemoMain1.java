
class Demo
{
	public void display()
	{
		System.out.println("This is Demo");
	}	
}

class Demo1 extends Demo
{
	public void display()
	{

		System.out.println("This is Demo1");
	}
}

class Demo2 extends Demo1
{
	public void display()
	{

		System.out.println("This is Demo2");
	}
}

class DemoMain1 extends Demo2
{
	public void display()
	{

		System.out.println("This is DemoMain");
	}
	public static void main(String []at)
	{
		Demo d;
		d=new DemoMain1();
		d.display();
	}
}