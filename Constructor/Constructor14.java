class Constructor14
{ 
	Constructor14()
	{
		this(10);
		System.out.println("Constructor14 - 0 arg const");

	}
	Constructor14(int a)
	{	
		this(100, 200.5f);									
		System.out.println("Constructor14 - 1 arg const");
	}
	Constructor14(int a, float b)
	{
		System.out.println("Constructor14 - 2 arg const");

	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Constructor14 obj = new Constructor14();
		System.out.println("Stop");
	}
}