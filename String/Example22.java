class Example22
{			  
	public static void main(String args[])
	{
		String str = "This is an example on split method";
		String[] s= str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}