class  Constructor11
{
	Constructor11()
	{
		System.out.println("Constructor11 - 0 arg cons");
		this(10);
	}
	Constructor11(int a)
	{
		System.out.println("Constructor11 - 1 arg cons");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Constructor11 obj = new Constructor11();
		System.out.println("Stop");
	}
		
}
// call to this must be first statement in  every constructor.
