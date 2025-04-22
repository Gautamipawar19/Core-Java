class StaticMethod3
{
	public static void main(String args[])
	{
		//Directly
		test1();
		//class name
		StaticMethod3.test1();
		
	
	}
	static void test1()
	{
		System.out.println("Inside test1");
		
	}
}