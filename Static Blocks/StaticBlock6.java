class HDFC
{
	int amountBal;
	static{
		System.out.println("logics to create to adhaar server");

	}
	{
		System.out.println("logics to get & verify OTP from adhaar Server");
	}
	HDFC (int amountBal)
	{
		 if(amountBal >= 10000)
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

class StaticBlock6
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		HDFC cust1 = new HDFC(10000);
		System.out.println("Stop @ cyber Success");
	}
}