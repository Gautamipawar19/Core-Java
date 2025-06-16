import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Example30
{
	void test3() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Inside Test3 method");
		Thread.sleep(3000);
		FileInputStream f = new FileInputStream("C:\\Demo.txt");
	}
	void test2() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Inside Test2 method");
		test3();
	}
	void test1() throws InterruptedException, FileNotFoundException
	{	
		System.out.println("Inside Test1 method");
		test2();
	}
	public static void main(String args[])throws InterruptedException, FileNotFoundException
	{
		System.out.println("Start @ Cyber Success");
		Example30 ref = new Example30();
		ref.test1();
		System.out.println("Stop @ Cyber Sucess");
	}
}