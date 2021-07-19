//Inheritance
import java.io.*;
class Super
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int rollno;
	String name;
	public void accept()throws Exception
	{
		System.out.println("Enter your rollno:");
		rollno=Integer.parseInt(br.readLine());

		System.out.println("Enter your name:");
		rollno=br.readLine();
	}
}
class Subclass extends Super
{
	public void display()throws Exception
	{
		accept();
		System.out.println("Name ="+name);
		System.out.println("RollNo ="+rollno);
	}
	public static void main(String []at)
	{
		Subclass sc=new Subclass();
		sc.display();
		
	}	
	
}