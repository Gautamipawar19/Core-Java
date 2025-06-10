class Example13
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		int[] a={10, 20, 30};
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/2);
		}
		System.out.println("After try block- Befor catch block");

		catch (ArrayIndexOutOfBoundException ae)
		{
			System.out.println("Inside catch block");
		}
		System.out.println("Stop @ Cyber Success");
	}
}