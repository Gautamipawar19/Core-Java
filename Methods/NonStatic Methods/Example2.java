class Example2
{
	static int a=100;
	float b=200.5f;
	float result1;           
    static float result2;    


void m2()
{
	 System.out.println("Inside m2 Method");
	 Example2 ref1 = new Example2();
	 result1 = a + ref1.b;

}
static void m3()
{
	 System.out.println("Inside m3 Method");
	 Example2 ref1 = new Example2();
	 result2= a + ref1.b;
	
}
public static void main (String args[])
{
	System.out.println("Start @ cyber Success");
	Example2 ref1=new Example2();
	ref1.m1();
	System.out.println("Stop @ cyber Success");

}
void m1()
{
	System.out.println("Inside m1 Method");
	m2();
	m3();
	
	float finalresult =result1 + result2;
	System.out.println("finalresult is: " +finalresult);
}
}