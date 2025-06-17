class FlightUnavaliable extends RuntimeException
{
	FlightUnavaliable(String flightInfo)
	{
		super(flightInfo);
	}
}