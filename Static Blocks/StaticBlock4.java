class StaticBlock4
{
	static int a;
	static
	{
		System.out.println("Inside Static Blocks " +a);
		a=10;
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		System.out.println(a);
		System.out.println("Stop @ Cyber Success");
	}
}