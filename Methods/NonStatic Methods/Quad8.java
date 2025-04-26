class Demo
{
  float a=20.5f;
  float b=30.6f;
  void  m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Quad8
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		Demo d=new Demo();
		System.out.println(d.a + d.b);
		d.m1();
		System.out.println("Stop @ cyber success");
	}
}