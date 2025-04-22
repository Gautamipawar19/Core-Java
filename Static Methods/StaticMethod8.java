class StaticMethod8
{
	public static void main(String args[])
	{
		System.out.println("Start");
		//result= declare 2 var int a,b
		//System.out.println(result)
		int a=10, b=20;
		int result =m1(a,b);
		System.out.println("The result is :" +result);
		System.out.println("Stop");
	}
static int m1(int a , int b)
	{
		System.out.println("Inside test1 method");
		int result = a*b;
		return result;
	}
}