class HDFC
{
	int amountBal;
	HDFC(int amountBal)
	{	if (amountBal >0)
		{
			this.amountBal = amountBal;
		}
		else
		{
			System.out.println("Inside Else2");
			//System.out.println(10/0); //new ArithmeticException() -> /by Zero
			throw new ArithmeticException("Please enter valid amount");
		}
	}
}
class Example32
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		HDFC ref = new HDFC(0);
		System.out.println("Stop @ Cyber Success");
	}
}