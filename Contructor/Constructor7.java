class Constructor7
{
	Constructor7()
	{
		System.out.println("Inside 0 arg Constructor -One");
	}
	Constructor7()
	{
		System.out.println("Insdie 0 arg Constructor - Two");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Constructor7 obj1 = new Constructor7();
		System.out.println("Stop @ cyber Success");
	}

}
// In Constructor duplicate constructor are not allowed.