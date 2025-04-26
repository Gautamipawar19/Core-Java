class Example1
{
	int a=100;
	static float b=200.5f;
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Example1 ref=new Example1();
		float result= ref.a + b;
		System.out.println("Result is :" +result);
		ref.m1();
		System.out.println("Stop @ cyber Success");
		
	}
void m1()
	{
		System.out.println("inside m1 method");
		float result1 = a +b;
		System.out.println("Result1 is :" +result1);
	}


}