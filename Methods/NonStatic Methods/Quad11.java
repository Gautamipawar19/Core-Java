class Quad11
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 method");
		
	}
	
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
		//Directly
		System.out.println(a); m1();
		//object
		Quad11 ref=new Quad11();	
		System.out.println(ref.a);
		ref.m1();
	}
}