class Constructor15
{
	Constructor15(int a)
	{
		this();
		System.out.println("Constructor15 - 1 arg Constructor");
	}
	Constructor15()
	{
		this(10);
		System.out.println("Constructor15 - 0 arg Constructor");
	}
public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Constructor15 ref=new Constructor15(100);
		System.out.println("Stop @ cyebr Suucess");
	}
}


 //recursive constructor calling is not Supported by java.

