class Example17
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		int[] a = {10, 20,30};
		try
		{
			System.out.println("Inside Outer Try Block");
			try
			{
				System.out.println(" --> Inside Outer Try -Inner try Block");
				System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{
				System.out.println(" --> Inside Outer Try - Inner Catch Block");
			}
			System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{	
			System.out.println("Inside Outer Catch Block");
			try
			{
				System.out.println(" -->Inside Outer Catch - Inner Try Block");
				System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{
				System.out.println(" -->Inside Outer Catch - Inner Catch Block");
			}
		}
		System.out.println("Stop @ Cyber Success");
	}
}