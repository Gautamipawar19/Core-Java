class Demo
{	int a;
	{
		System.out.println("Inside Non-Static Blocks " +a);
		a=10;
	}
	Demo()
	{
		System.out.println("Befor 0 args Const " +a);
		a=100;
		System.out.println("After 0 args Const " +a);
	}
	Demo(int x)
	{
		System.out.println("Befor 1 args Const " +a);
		a=1000;
		System.out.println("After 1 args Const " +a);
	}
}
class Example8
{
	public static void main(String args[])
    {
		System.out.println("Start @ cyber Success");
		Demo d1 = new Demo();
		Demo d2 = new Demo(10);
		System.out.println("Stop @ cyber Success");
    }
}