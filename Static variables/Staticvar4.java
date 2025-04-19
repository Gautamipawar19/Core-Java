class Demo
{
	static char var='x';
	
}
class Staticvar4
{
	public static void main(String args[])
	{
		System.out.println("Start");
		//Directly
		//System.out.println(x);
		//class name
		System.out.println(Demo.var);
		//object
		System.out.println("Stop");
	}
}