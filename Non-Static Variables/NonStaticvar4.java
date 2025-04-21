class Sample
{
	int a=100;
	float b=200.5f;
	
}
class NonStaticvar4
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Sample s=new Sample();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println("Stop");
	}
}