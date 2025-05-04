class Example4
{
	{
		System.out.println("inside non static  blocks");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Example4 ref1 = new Example4();
		Example4 ref2 = new Example4();
		Example4 ref3 = new Example4();
		System.out.println("Stop @ cyber Success");
	}
}