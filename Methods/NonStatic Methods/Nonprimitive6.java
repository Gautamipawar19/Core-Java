class Nonprimitive6
{
	int a=100;
	Nonprimitive6 d;
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Nonprimitive6 ref=new Nonprimitive6();
		System.out.println(ref.a);
		//System.out.println(ref.d);
		ref.d=new Nonprimitive6();
		ref.a=200;
		ref.d.a=300;
		System.out.println(ref.a);
		System.out.println(ref.d.a);
		System.out.println("Stop @ cyber Success");
	}
	
}