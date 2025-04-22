class StaticMethod6
{
	public static void main(String args[])
	{
		int var1=100;
		float var2=200.5f;
		add(var1,var2);
	}
		static void add(int a, float b)
	{
			System.out.println("Inside add method");
			float result=a+b;
			System.out.println(result);
}
	
}