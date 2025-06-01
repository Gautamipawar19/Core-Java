class Example13
{
	public static void main(String args[])
	{						 
		String str1 = "Cyber";
		String str2 = "Success";
		String str3 = "Cyber";
		System.out.println(str1.equals(str2));	
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		String s1 = new String("Cyber");
		String s2 = new String("Success");
		String s3 = new String("Cyber");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));

	}
}