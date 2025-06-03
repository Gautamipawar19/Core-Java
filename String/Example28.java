import java.util.StringTokenizer; 
class Example28
{
	public static void main(String args[])
	{
		String str = "This is, an examaple, on StringTokenizer";
		StringTokenizer st1 =  new StringTokenizer(str, ",");
		while(st1.hasMoreElements())
		{
			String ss =(String)st1.nextElement();
			System.out.println(ss);
		}
	}
}