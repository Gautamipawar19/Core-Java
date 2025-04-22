class Demo
{
	static float result;

	static float m1(int var1, float var2){
		System.out.println("Inside m1 method");
		return var1 + var2;
		
	}
	static {
       result = m1(100, 200.5f); 
		
    }
}

class StaticMethod10
{
	public static void main(String args[])
	{
		System.out.println("Start");
		//Demo.var1=100;
		//Demo.var2=200.5f;
		System.out.println(Demo.result);
		System.out.println("Stop");
		
	}
}