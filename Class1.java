class Class_Objects
{
	int rollno;
	String name;
	void accept(int rno,String sname)
	{
		rollno=rno;
		name=sname;
	}
	
	void display()
	{
		System.out.println("Name of student:"+name);
		
	}
	public static void main(String []at)
	{
		 Class_Objects co=new  Class_Objects();
		co.accept(101,"ABC");
		System.out.println("RollNo of Student :"+co.rollno);
		co.display();
		
	}
}