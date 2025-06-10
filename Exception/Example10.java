class Example10
{				  
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		int[] a ={10, 20, 30};
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
			System.out.println(a[5]);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch ArithmeticException ");
		}
		System.out.println("Start @ Cyber Success");
	}
}