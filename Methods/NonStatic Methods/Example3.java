class Sample
{
	static int a=100;
}
class Demo
{
	float b=200.5f;
}
class Example3
{
	public static void main(String args[])
	{
		System.out.println("start @ cyber Success");
		Demo d=new Demo();
		float result1= Sample.a+d.b;
		System.out.println("result is :" +result1);
		Example3 ref=new Example3();
		ref.m1();
		System.out.println("stop @ cyber Success");
		
	}
	void m1()
	{
		System.out.println("inside m1 method");
		Demo d=new Demo();
		float result2= Sample.a+d.b;
		System.out.println("result is :" +result2);
	}
}