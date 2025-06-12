class Example24
{	 
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}
		System.out.println("Stop @ Cyber Success");
	}
}