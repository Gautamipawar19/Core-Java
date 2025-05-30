class Example6 
{
	public static void main(String args[])
	{
		String s1 ="Cyber";
		String s2 = "Success";								  
		String s3 = "Cyber";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		String str1 =new String("Cyber");
		String str2 = new String("Success");
		String str3 = new String("Cyber");
		System.out.println(str1 ==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str1);

	}		   
}