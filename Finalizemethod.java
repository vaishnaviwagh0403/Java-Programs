//FINALIZE METHOD

class Sample
{
	protected void finalize()
	{
		System.out.println("Garbage Collected");
	}
	void sample1()
	{
		Sample s=new Sample();
		s.finalize();
	}
}
class Finalizemethod extends Sample
{
	public static void main(String []at)
	{
		Finalizemethod fm=new Finalizemethod(); 
		fm.sample1();
	
			
	}
}