class Example15
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside Try Block");						
			System.out.println(10/0);
		}
		catch (Exception e)
		{
			System.out.println("Inside Catch Block");
			//toString()
			System.out.println(e.toString());
			System.out.println("_ _ _ _ _ _ _ _");
			//getMessage()
			System.out.println(e.getMessage());
			System.out.println("_ _ _ _ _ _ _ _");
			//printStackTrace
			e.printStackTrace();
		}
		System.out.println("Stop @ Cyber Success");
	}
}