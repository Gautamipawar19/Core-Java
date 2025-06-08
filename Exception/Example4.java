class Example4
{ 
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}	
		catch(ArithmeticException ae)
		{
			System.out.println("Inside Catch Block");
			System.out.println(10/2);
		}
		System.out.println("Stop @ Cyber Success");
	}
}