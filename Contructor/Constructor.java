class Zomato
{
	String prodName;
	 Zomato(String prodName)
	{  
		 if(prodName == "Pizza")
		{
		this.prodName = prodName;
		System.out.println("Order is Done");
		}
		else
		{
			System.out.println("Order is not Done");
		}
	}
	
}
class Constructor
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Zomato ref1 = new Zomato("Pizza");
		System.out.println("Stop @ Cyber Success");
	}
}
 