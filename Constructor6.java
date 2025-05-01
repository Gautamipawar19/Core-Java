class Constructor6
{
	Constructor6(int a)
	{
		System.out.println("Inside 0 arg Constructor");
	}
	
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Constructor6 obj1 = new Constructor6();
		Constructor6 obj2= new Constructor6();
		System.out.println("Stop @ cyber Success");
	}

}
/*constructor in class Constructor6 cannot be applied to given types.
required: int
found: no arguments
reason: actual and formal argument lists differ in length
*/