class object
{ 
	String a="Hello";
	void test1()
	{
		System.out.println("Inside Test1 method");
	}
}
class Quad6
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		//class name
		//System.out.println(object.a); object.test1();
		object ref=new object();
		System.out.println(ref.a); ref.test1();
		System.out.println("Stop @ cyber success");
	}
		
}
