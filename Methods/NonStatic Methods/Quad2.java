class Demo
{
	static int a=100;
	static void m1()
	{
		System.out.println("inside m1 method");
		
	}
}
class Quad2
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		//class name 
		System.out.println(Demo.a); Demo.m1();
		//object
		Demo d=new Demo();
		System.out.println(d.a);
		d.m1();
		System.out.println("Stop @ cyber success");	
	}
	
}