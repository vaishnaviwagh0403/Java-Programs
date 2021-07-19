class Final
{
	final  int a=10;
	void display()
	{
		a=20;
		System.out.println("A is:"+a);
	}
	public static void main(String []at)
	{
		Final f=new Final();
		f.display();
	}
	
}