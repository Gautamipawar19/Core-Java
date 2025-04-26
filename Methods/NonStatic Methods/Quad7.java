class Quad7
{
	byte x=127;
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		//class name
		//System.out.println(Quad7.x); Quad7.m1();
		Quad7 b=new Quad7();
		System.out.println(b.x);
		b.m1();
		System.out.println("Stop @ cyber success");
	}
}