class Example19
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
		catch (Exception e)
		{
			System.out.println("Inside Exception Block");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside Catch Block");
		}
		System.out.println("Stop @ Cyber Sucuess");
	}
}