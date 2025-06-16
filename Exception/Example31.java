class Example31
{
	void test3()throws ArithmeticException 
	{
		System.out.println("Inside Test3 method");
		System.out.println(10/0);
	}
	void test2() throws ArithmeticException 
	{
		System.out.println("Inside Test2 method");
		test3();
	}
	void test1() throws ArithmeticException 
	{
		System.out.println("Inside Test1 method");
		test2();
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example31 ref = new Example31();
		ref.test1();
		System.out.println("Stop @ Cyber Success");
	}
}			  