class Example18
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		int[] a = {10, 20 , 30};
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/2);
			System.out.println(a[5]);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside Catch Block");
		}
		catch (Exception e)
		{
			System.out.println("Inside Exception Block");
		}
		System.out.println("Stop @ Cyber Sucuess");
	}
}