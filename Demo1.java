import java.util.*;
class Demo extends Thread
{
	Demo1 t;
	String name;
	public Demo(String s,Demo1 t1)
	{
		name=s;
		start();
		t=new Demo1();
		t=t1;
	}
	public void run()
	{
		t.display(name);
	}
}
class Demo1
{
	synchronized void display(String name1)
	{
		try{
			for(int i=0;i<=5;i++)
			{
				System.out.println(name1+" "+i);
			}
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
		
	}
	public static void main(String[]args)
	{
		Demo1 md=new Demo1();
		Demo md1=new Demo("First",md);
		Demo md2=new Demo("Second",md);
		Demo md3=new Demo("Third",md);

	}
}