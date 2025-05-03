class Demo
{
	Demo()
	{
		System.out.println("Demo - 0 arg Constructor");
	}
}
class Constructor16
{	
	Constructor16(Demo d)
	{
		System.out.println("Constructor16 - 1 arg Constructor");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Constructor16  ref = new Constructor16(new Demo());
		System.out.println("Stop @ cyber Success");
	}
}