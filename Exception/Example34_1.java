class Flipkart
{
	void deliveryStatus(boolean status) throws NotDeliverable
	{
		if(status==true)
		{
			System.out.println("Delivery is possible");
		}
		else
		{
			throw new NotDeliverable("product not Deliverable is your area");
		}
	}
}
class Example34_1
{
	public static void main(String args[]) throws NotDeliverable
	{
		System.out.println("Start @ Cyber Success");
		Flipkart cust2 = new Flipkart();
		cust2.deliveryStatus(false);
		System.out.println("Stop @ Cyber Success");
	}
}