class Example6
{  
	public static void main (String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch (NullPointerException ai)
		{
			System.out.println("Inside catch block");
			System.out.println(10/2);
		}
		System.out.println("Stop @ Cyber Success");
	}
}