class Example7
{
	public static void main(String args[])
	{
		//Primitive -> Wrapper Object
		Integer ii = new Integer(100);
		System.out.println(ii);
		System.out.println(ii.toString());
		// Wrapper Object -> Primitive
		int jj = ii.intValue();
		System.out.println(jj);
	}					  
}