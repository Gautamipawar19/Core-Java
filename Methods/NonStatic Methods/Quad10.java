class Abc
{
	static int a=100;
	static void m1()
	{
		System.out.println("Inside m1 method");
				
	}
}
class Quad10
{
	public static void main(String args[])
	{
		System.out.println("start");
		Quad10 ref =new Quad10();
		ref.test1();
		System.out.println("Stop");
	}
	
	void test1()
	{
		System.out.println("Inside test1 method");
		System.out.println(Abc.a); 
		Abc.m1();
		Abc d = new Abc();
		System.out.println(d.a);
		d.m1();
	}
}