class HDFC
{
	int amountBal;
	HDFC(int amountBal)
	{	if(amountBal >= 10000)
		{
		this.amountBal = amountBal;
		System.out.println("Account Creation is Successfull");
	    }
		else
		{
			System.out.println("Unable to create account");
		}
	}
	
}
class Constructor9
{
	public static void main(String args[])
	{
		System.out.println("Start @W cyber Success");
		HDFC obj1 = new HDFC(15000);
		System.out.println("Stop @ cyber Success");
	}
	
}