class Example8
{   
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println(10/0);
			System.out.println("Inside try block");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		System.out.println("Stop @ Cyber Success");
	}
}