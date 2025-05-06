class Demo
{ 
	static int a=10;
	static 
	{
		System.out.println("Inside Static Blocks");
	}
}	 
class StaticBlock5
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success ");
		System.out.println(Demo.a);
		System.out.println("Stop @ Cyber Success ");
	}
}
