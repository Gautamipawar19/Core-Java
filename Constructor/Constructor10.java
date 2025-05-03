class Constructor10
{
	Constructor10()
	{
		this(10); //this is the method or statement.
		System.out.println("Constructor10 - 0 arg Constructor");
	}
	Constructor10(int a)
	{
		System.out.println("Constructor10 - 1 arg Constructor");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Constructor10 obj = new Constructor10();
		System.out.println("Stop");
	}
}
