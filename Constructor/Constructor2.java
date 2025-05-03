class Constructor2
{
	Constructor2()
	{
		System.out.println("Inside 0 arg Constructor");
		return; //--> by default compiler are set the return statement.
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Constructor2 obj = new Constructor2();
		System.out.println("Start @ Cyber Success");
	}
}