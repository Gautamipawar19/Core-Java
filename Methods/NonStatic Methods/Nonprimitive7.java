class Nonprimitive7
{ 
	int a=100;
	void m1()
	{
		System.out.println("inside m1 Mehtod");
	}
	Nonprimitive7 retval;
	public static void main(String args[])
	{
		System.out.println("Start");
		Nonprimitive7 refvar=new Nonprimitive7();
		refvar.retval=new Nonprimitive7();
		refvar.retval.m1();
		System.out.println("Stop");
	}

}
