class Example26
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		try
		{
			System.out.println("Inside Try Block");
			System.exit(0);//Normal Shutdown
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}
		System.out.println("Stop @ Cyber Succes");
	}
}

//System class
//public static void exit(int status)