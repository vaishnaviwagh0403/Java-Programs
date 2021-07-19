abstract class Parent
{
	 abstract void display();
}
class Child2 extends Parent
{

	void display()
	{
		System.out.println("hello");
	}
	public static void main(String []at)
	{
		Child2 c=new Child2();
		c.display();
	}	
}