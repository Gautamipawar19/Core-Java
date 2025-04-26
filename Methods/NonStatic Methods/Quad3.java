class Quad3
{
	float x=100.5f;
	void test1()
	{
		System.out.println("Inside test1 method");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Quad3 ref=new Quad3();
		System.out.println(ref.x);
		ref.test1();
		System.out.println("Stop @ cyber Success");
	}
}