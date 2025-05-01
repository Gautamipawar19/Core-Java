class Constructor5
{
	Constructor5()
	{
		System.out.println("Inside 0 arg Constructor");
	}
	Constructor5(int a)
	{
		System.out.println("Insdie 1 arg Constructor");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Constructor5 obj1 = new Constructor5();
		Constructor5 obj2= new Constructor5(10);
		System.out.println("Stop @ cyber Success");
	}

}