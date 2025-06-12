class Example21
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside Try Blocks");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside ArithmeticException Block");
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}
		System.out.println("Stop @ Cyber Success");
	}
}