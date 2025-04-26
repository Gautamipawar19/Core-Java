class Quad1
{
	static int a=100;
	static void m1()
	{
		System.out.println("inside m1 method ");
		
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		//Directly
		System.out.println(a); m1();
		//class name
		System.out.println(Quad1.a); Quad1.m1();
		//object
		Quad1 ref=new Quad1();
		System.out.println(ref.a);
		ref.m1();
		System.out.println("Stop @ cyber success");
		
	}
}