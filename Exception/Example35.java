class RedBus
{   
	void bookTicket(String destination)
	{
		if(destination.equals("Srinagar"))
		{
			System.out.println("Bus is Avaliable");
		}
		else
		{
			throw new BusUnavaliable();
		}
	}
}
class Example35
{
	public static void main(String agrs[]) throws BusUnavaliable
	{
		System.out.println("Start @ Cyber Success");
		RedBus cust1 = new RedBus();
		cust1.bookTicket("lakhanpur");
		System.out.println("Stop @ Cyber Success");
	}
}