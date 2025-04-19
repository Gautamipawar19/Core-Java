class Demo
{
	static float x=200.5f;
}
class Sample
{
	static int y=100;
}
class Staticvar6
{
	static float z=300.5f;
	public static void main(String args[])
	{
		float result;
		result=Demo.x+Sample.y+z;
		System.out.println("The result is :" +result);
	}
}