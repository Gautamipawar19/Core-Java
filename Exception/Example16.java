class Example16
{	  
	void m3()
	{
		System.out.println("Inside m3 method");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}
	void m2()
	{
		System.out.println("Inside m2 method");
		m3();
	}
	void m1()
	{
		System.out.println("Inside m1 method");
		m2();
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		new Example16().m1();
		System.out.println("Stop @ Cyber Success");
	}
}											 