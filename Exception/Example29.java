class Example29
{
	void test3() throws InterruptedException
	{
		System.out.println("Inside m3 method");
		Thread.sleep(3000);
	}
	void test2() throws InterruptedException
	{
		System.out.println("Inside m2 method");
		test3();
	}
	void test1() throws InterruptedException
	{
		System.out.println("Inside m1 method");
		test2();
	}
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Start @ Cyber Success");
		Example29 ref =new Example29();
		ref.test1();
		System.out.println("Stop @ Cyber Success");
	}
}