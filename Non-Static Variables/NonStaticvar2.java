class NonStaticvar2
{
	int a;
	static float b;
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		System.out.println(b);
		NonStaticvar2 refvar = new NonStaticvar2();
		System.out.println(refvar.a);
		System.out.println("Stop @ cyber Sucess");
	}
}