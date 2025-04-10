class Switch4
{
	public static void main(String  args[])
	{
		System.out.println("Start @ cyber success");
		char signal='r';
		switch(signal)
		{
			case 'r': System.out.println("stop");
			break;
			case 'y': System.out.println("slow down");
			break;
			case 'g': System.out.println("go");
			break;
			default : System.out.println("invalid signal");
			break;
		}
		System.out.println("Stop @ cyber success");
	}
}