class MakeMyTrip
{	void  bookflight(String source)
	{
		if(source.equals("Aadaman"))
		{
			System.out.println("Flights are Avaaliable");
		}
		else
		{
			   throw new FlightUnavaliable("flight is not avaliable, try nearest port");
		}
	}
}
class Example36
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		MakeMyTrip cust1 = new MakeMyTrip();
		cust1.bookflight("Lakswadeep");
		System.out.println("Stop @ Cyber Success");
	}
}