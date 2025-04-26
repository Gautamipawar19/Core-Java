class Nonprimitive2
{
	static Nonprimitive2 ref;
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		ref=new Nonprimitive2();
		ref.m1();
		System.out.println("Stop @ cyber Success");
		
	}
	void m1()
	{
		System.out.println("Inside m1 method");
	}	
}