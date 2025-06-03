class Example24
{
	public static void main(String args[])
	{			  
		String str1 = "Cyber";
		String str2 = "cyber";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		String str11 = "Success";
		String str22 = "success";
		System.out.println(str11.compareTo(str22));
		System.out.println(str11.compareToIgnoreCase(str22));
	}
}