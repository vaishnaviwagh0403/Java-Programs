class Parent
{
	String name;
	void display()
	{
		System.out.println("name is:"+name);
	}
	
}
class Child extends Parent
{
	String name;
	Child()
	{
		super.name="Mohan";
		super.display();
		name="Sharma";

	}
	void display()
	{
		System.out.println("Name is :"+name);
	}
	public static void main(String at[])
	{
		Child c=new Child();
		c.display();
	}
}