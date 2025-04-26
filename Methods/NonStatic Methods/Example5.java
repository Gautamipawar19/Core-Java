class A
{
	int a=100;
	void m1()
	{
		System.out.println("inside m1 method");
		B.m2();
	}
}
class B
{
	float b=200.f;
	static void m2()
	{
		System.out.println("Inside m2 method");
		A a1=new A();
		B b1=new B();
		System.out.println(a1.a + b1.b);
	}
}
class Example5
{
	public static void main(String args[])
	{
		System.out.println("start @ cyber Success");
		A a1=new A();
		a1.m1();
		System.out.println("stop @ cyber Success");
		
	}
}