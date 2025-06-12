class Example25
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside Catch Block");
		}
		finally
		{
			System.out.println("Inside Finally Block");
			try
			{
				System.out.println("Inside Finally - Try");
				System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{
				System.out.println("Inside Finally - Catch");
			}
		}
		System.out.println("Stop @ Cyber Success");
	}
}