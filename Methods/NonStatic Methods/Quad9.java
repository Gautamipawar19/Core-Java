class Quad9
{
	static int a=100;
	static void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String args[])
	{
		System.out.println("start");
		Quad9 ref= new Quad9();
		ref.test1();
		System.out.println("Stop");
	}
	void test1()
	{
		System.out.println("Inside test1 method");
		//Directly
		System.out.println(a);
		m1();
		System.out.println(Quad9.a);
		Quad9.m1();
		Quad9 ref= new Quad9();
		System.out.println(ref.a);
		ref.m1();
		
	}
}