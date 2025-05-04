class HDFC
{
	int amountBal;
	{
		System.out.println("logics to get & verify OTP from Adhaar server");
	}
	HDFC(int amountBal)
	{
		this.amountBal = amountBal;
		if(amountBal >= 10000)
		{
			System.out.println("Account creation is successfull");
		}
		else
		{
			System.out.println("Unable to create account");
		}
	}
}
class Example7
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		HDFC cust1 = new HDFC(10000);
		HDFC cust2 = new HDFC(15000);
		System.out.println("Stop @ cyber Success");
	}
}