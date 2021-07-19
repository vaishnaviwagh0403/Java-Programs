
class Demo
{
	public void display()
	{
		System.out.println("This is Demo");
	}	
}

class Demo1
{
	public void display()
	{

		System.out.println("This is Demo1");
	}
}

class Demo2
{
	public void display()
	{

		System.out.println("This is Demo2");
	}
}

class DemoMain
{
	public void display()
	{

		System.out.println("This is DemoMain");
	}
	public static void main(String []at)
	{
		DemoMain d=new DemoMain();
		Demo dd=new Demo();
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		d.display();
		dd.display();
		d1.display();
		d2.display();
	}
}