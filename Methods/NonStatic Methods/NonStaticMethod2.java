class NonStaticMethod2
{
	float add(int a, float b)
	{
		System.out.println("inside Nonstatic n1 method");
		float result =a+b;
		return result;
	}
	public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		int a=10;
		float b=20.5f;
		NonStaticMethod2 ref=new NonStaticMethod2();
		float result=ref.add(a,b);
		System.out.println(result);
		System.out.println("Stop @ cyber success");
		
	}
}