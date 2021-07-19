//INTERFACE
interface Area
{
	void area();
}
class Square implements Area
{
	void area(int side)
	{
		System.out.println("Area of Square:"+(side*side));
	}
}
class Rectangle implements Area
{
	void area(int length,int breadth)
	{
		System.out.println("Area of Square:"+(length*breadth));
	}

}
class Triangle implements Area
{
	void area(float breadth,float height)
	{
		System.out.println("Area of Square:"+((0.5)*breadth*height));
	}
}
class Interfaces
{
	public static void main(String []at)
	{
		Square s=new Square();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		s.area();
		r.area();
		t.area();	
	}
}