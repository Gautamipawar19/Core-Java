class Staticvar3
{
   static float result;
   public static void main(String args[])
	{
		int x=10;
		float y=20.5f;
		result=x+y;
		System.out.println("the result is :"+result);
		System.out.println("The result is : "+Staticvar3.result);
	}
}