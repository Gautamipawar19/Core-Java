class Example11
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		int[] a = {10, 20, 30};
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/2);
			System.out.println(a[5]);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch block ArithmeticException");
		}																	
		catch(ArrayIndexOutOfBoundsException ai)
		{		 
			System.out.println("Insdie catch block ArrayIndexOutOfBoundsException");
		}
		System.out.println("Stop @ Cyber Success");
	}

}