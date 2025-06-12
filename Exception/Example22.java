class Example22
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		catch (NullPointerException ae)
		{
			System.out.println("Inside NullPointerException Block");
		}
		finally
		{
			System.out.println("Start @ Cyber Success");
		}
		System.out.println("Stop @ Cyber Success");
	}
}