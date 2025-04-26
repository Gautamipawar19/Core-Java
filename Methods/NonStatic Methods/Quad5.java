class Quad5
{
  int b=200;
  void m1()
  {
     System.out.println("Inside m1 method");
	 
  }
  public static void main(String args[])
	{
		System.out.println("Start @ cyber success");
		//Directly
		//System.out.println(b); m1();
		//class name
		//System.out.println(Quad5.b); Quad5.m1();
		//object
		Quad5 ref=new Quad5();
		System.out.println(ref.b); ref.m1();
		System.out.println("Stop @ cyber success");
		
	}
}