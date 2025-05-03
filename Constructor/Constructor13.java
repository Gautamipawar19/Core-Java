class Constructor13
{	
	int a=100;
	Constructor13()
	{
		System.out.println("Constructor13 - 0 arg const");
	}
	Constructor13(int a)
	{
		this();
		this.a = a;
		System.out.println(a);
		System.out.println("Constructor13 - 1 arg const");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Constructor13 obj = new Constructor13(10);
		System.out.println("Stop @ Cyber Success");
	}
}	