class Example8
{
	public static void main(String args[])
	{
	    String num1 = "100";
		String num2 = "200";
		// String -> Wrapper Object
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		System.out.println(i1 + i2);
		//String -> Primitive
		int var1 = Integer.parseInt(num1);
		int var2 = Integer.parseInt(num2);
		System.out.println(var1 + var2);
	}
}