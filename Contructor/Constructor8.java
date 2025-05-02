class Constructor8
{
	int a;
	Constructor8()
	{
		System.out.println("Inside 0 arg cons - One ");
		a=10;
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Constructor8 obj1 = new Constructor8();
		System.out.println("Stop");
	}
}