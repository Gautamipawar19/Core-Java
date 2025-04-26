class Sample
{
	static int a=100;
	void m2()
	{
		System.out.println("Inside m2 method");
		Demo d=new Demo();
		float result2=a+d.b;
		System.out.println("Result is :" +result2);
	}
}
class Demo
{
	float b=200.5f;
	static void m1()
	{
		System.out.println("Inside m1 method");
		Demo d=new Demo();
		float result1=Sample.a+d.b;
		System.out.println("Result is :" +result1);
	}
}
class Example4
{
	public static void main(String args[])
	{
		System.out.println("start @ cyber Success");
		Demo.m1();
		Sample s=new Sample();
		s.m2();
		System.out.println("stop @ cyber Success");
		
	}
}