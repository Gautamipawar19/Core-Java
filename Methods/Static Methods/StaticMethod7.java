class StaticMethod7
{
	public static void main(String args[])
	{
		System.out.println("Start");
		float result=m1();
		System.out.println("The result is :" +result);
		System.out.println("stop");
	}

static float m1()
{
	System.out.println("Inside test1 method");
	int x1=10;
	float y1=20.5f;
	float result=x1 + y1;
	return result;
}
}
