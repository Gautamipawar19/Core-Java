class Demo
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 method " +a);
	}

}
class Nonprimitive3
{
	static Demo d=new Demo();
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		d.m1();
		System.out.println("Stop @ cyber success");
	}
} 