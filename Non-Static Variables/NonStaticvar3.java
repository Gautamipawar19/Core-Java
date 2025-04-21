class  NonStaticvar3
{
	int a=100;
	float b=200.5f;
	public static void main(String args[])
	{
		System.out.println("Start");
		 NonStaticvar3 ref =new  NonStaticvar3();
		 System.out.println(ref.a + ref.b);
		 System.out.println("Stop");
	}
	
}