class Flipkart
{
	void deliveryStatus(boolean status)
	{
		if(status == true)
		{
			System.out.println("Delivery is possible");
		}
		else
		{
			try
			{
				throw new NotDeliverable("product not Deliverable is your area");
			}
			catch (NotDeliverable nd)
			{					  
				System.out.println("Do you want to modifed when the delivery Starts ");
			}
		}
	}
}
class Example34
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Flipkart cust2 = new Flipkart();
		cust2.deliveryStatus(false);
		System.out.println("Stop @ Cyber Success");
	}
}