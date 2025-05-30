class Demo
{
	//to String()
}
class String1
{
	String info;
	String1(String info)
	{
		this.info = info;
	}
	public String toString()
	{
		return info;														  
	}
}
class Example5 
{
	public static void main(String args[])
	{	
		Demo d = new Demo();
		System.out.println(d);
		System.out.println(d.toString());
		String1 ref = new String1("Cyber");
		System.out.println(ref);
		System.out.println(ref.toString());
		String str = new String("Success");
		System.out.println(str);
		System.out.println(str.toString());
	}
}