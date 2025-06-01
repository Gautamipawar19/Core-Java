class Example11
{
	public static void main(String args[])
	{
		//String to StringBuffer
		String str = "Cyber";
		System.out.println(str);		  
		StringBuffer sb1=new StringBuffer(str);
		System.out.println(sb1);
		System.out.println(sb1.reverse());
	}
}