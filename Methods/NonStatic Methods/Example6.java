class Demo
{
	int a =100;
}
class Sample
{
	static float b=200.5f;
}
class Cyber
{
	float m1()
	{
		Demo D=new Demo();
		float result1=D.a+Sample.b;
		System.out.println("The result is "+result1);
		return result1;
	}
}
class Success
{	float m2()
	{
		Demo D=new Demo();
		float result2=D.a+Sample.b;
		System.out.println("The result is "+result2);
		return result2;
	}
}
class Example6
{
	public static void main (String [] args)
	{
	System.out.println("Start @ Cyber Success");
	Cyber c=new Cyber();
	float result1=c.m1();
	Success s=new Success();
	float result2=s.m2();
	float finalresult=result1+result2;
	System.out.println("The final Result is "+finalresult);
	
	System.out.println("Stop @ Cyber Success");
	}
}