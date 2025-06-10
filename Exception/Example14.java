class Example14
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		int[] a = {10, 20, 30};
		try
		{
			System.out.println("Inside Try Blocks");
			System.out.println(10/2);
			System.out.println(a[5]);
		}
		catch (Exception e)
		{
			System.out.println("Inside Exception Catch Blocks");
			System.out.println(e);
		}
		System.out.println("Stop @ Cyber Success");
	}
}