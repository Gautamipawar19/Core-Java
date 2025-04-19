class Demo
{
	static float x;
}
class Sample
{
	static float y;
}
class Staticvar7
{
	static  float a=100.5f;
	static float b=200;
	public static void main(String args[])
	{
		int var1=10;
		float var2=20.5f;
		//add var1+a -->store in x
		//add var2+b -->store in y
		Demo.x=var1+a;
		Sample.y=var2+b;
		System.out.println(Demo.x);
	   System.out.println(Sample.y);
	   
	}
}