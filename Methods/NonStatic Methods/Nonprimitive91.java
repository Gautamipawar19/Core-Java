class Demo
{
	void m1()
	{
		System.out.println("Inside m1 method ");
	}
}
class Sample
{
	int a=100;
}
class Cyber
{
	Demo dd =new Demo();
	Sample ss=new Sample();
}
class Nonprimitive91
{ 
	
	public static void main(String args[])
	{
		System.out.println("Start");
	    Cyber c=new Cyber();
		c.dd=new Demo();
		c.ss=new Sample();
		c.dd.m1();
		System.out.println(c.ss.a);
		System.out.println("Stop");
	}

}
