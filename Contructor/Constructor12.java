class Constructor12
{ 
	Constructor12()
	{
		this(10);
		System.out.println("Constructor12 - 0 arg const");

	}
	Constructor12(int a)
	{	
		this("hello");									
		System.out.println("Constructor12 - 1 arg const");
	}
	Constructor12(String s)
	{
		System.out.println("Constructor12 - 2 arg const");

	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Constructor12 obj = new Constructor12();
		System.out.println("Stop");
	}
}