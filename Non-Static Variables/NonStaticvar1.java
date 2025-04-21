class NonStaticvar1
{
	int a=10;
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Suceess");
		//Directly
		//System.out.println(a); -->Invalid
		//Class Name
		//System.out.println(NonStaticvar1.a); --> Invalid
		//Object
		NonStaticvar1 refvar = new NonStaticvar1();
		System.out.println(refvar.a);
		System.out.println("Stop @ cyber Success");
	}
}