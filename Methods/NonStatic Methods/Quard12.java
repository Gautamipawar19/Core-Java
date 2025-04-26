class Sample1
{
	int a=10;
	void m1()
	{
		System.out.println("Inside m1 method");
		
	}
	
}
class Quad12
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Quad12 ref=new Quad12();
		ref.test1();
		System.out.println("Stop");
	
	}
	void test1()
	{
		System.out.println("Inside test1 method");
		Sample1 s=new Sample1();
		System.out.println(s.a);
		s.m1();
	}
}
