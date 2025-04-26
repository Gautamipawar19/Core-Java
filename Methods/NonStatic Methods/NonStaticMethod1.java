class NonStaticMethod1
{
	void m1()
	{
		System.out.println("Inside NonStatic m1 Method");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		NonStaticMethod1 ref=new NonStaticMethod1();
		ref.m1();
		System.out.println("Stop @ cyber success");
	}
}