class Flipkart			   
{
	void checkPhones(int prodId)
	{
		if(prodId>=101)
		{
			System.out.println("All products are Avaliable");
		}
		else
		{
			System.out.println("Currently Unavaliable");
			throw new CurrentlyUnavaliable(); 
		}
	}
}
class Example33
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Flipkart cust1 = new Flipkart();
		cust1.checkPhones(100);
		System.out.println("Stop @ Cyber Success");
		
	}
}