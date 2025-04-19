class Demo
{
	static int a=100;
}
class Staticvar5
{
	static float b=200.5f;
	public static void main(String args[])
	{
		float result;
		result=Demo.a+b;
		System.out.println("The result is :"+result);
		
	}
}