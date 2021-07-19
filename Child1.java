class Parent
{
	public void display()
	{
		System.out.println("Parent");
	}
}
class Child1 extends Parent
{
	public void display()
	{
		System.out.println("Child class");
	}
	public static void main(String []at)
	{
		Parent p=new Parent();
		Child1 c=new Child1();
		p=c;
		p.display();
	}
}