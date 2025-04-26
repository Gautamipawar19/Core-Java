class Sample
{
	void m1()
	{
		System.out.println("Inside m1 method ");
		
	}
}
class NonStaticMethod3
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		Sample s=new Sample();
		s.m1();
		System.out.println("Stop @ cyber success");
		
	}
}