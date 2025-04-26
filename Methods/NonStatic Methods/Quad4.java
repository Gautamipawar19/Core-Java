class Sample
{
   char a='x';
   void m1()
	{
		System.out.println("Inside m1 mehtod");
	}
}
class Quad4
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Sample s=new Sample();
		System.out.println(s.a);
		s.m1();
		System.out.println("Stop @ cyber success");
		
	}
}