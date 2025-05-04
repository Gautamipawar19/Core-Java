class Example6
{
	int a;
	{
		System.out.println("Inside non Static blocks");
		a=10;
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Example6 ref= new Example6();
		System.out.println(ref.a);
		System.out.println("Stop @ cyber Success");
	}
}