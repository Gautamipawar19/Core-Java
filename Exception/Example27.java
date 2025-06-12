class Example27
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		System.out.println(10/0);
		try
		{
			System.out.println("Inside Try Block");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside Catch Block");
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}
		System.out.println("Stop @ Cyber Succes");
	}
}               