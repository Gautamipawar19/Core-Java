class Example12	  
{
	public static void main(String args[])
	{
		//StringBuffer to String
		StringBuffer sb1 =new StringBuffer("Droid");
		System.out.println(sb1);
		//1 Approach ->Constructor
		String str1 =new String(sb1);
		System.out.println(str1);
		//2 Approasch ->toString()
		String str2 =sb1.toString();
		System.out.println(str2);
	}
}