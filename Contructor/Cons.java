class Zomato
{
	int custID;
    String custName;
    int mobNo;
	String prodName;
	Zomato (int custID, String custName, int mobNo,String prodName)
	{  
		 if(prodName == "Pizza")
		{
		this.prodName = prodName;
		this.custID = custID;
		this.custName = custName;
		this.mobNo = mobNo;
		System.out.println("Order is Successfully  Done");

		}
		else
		{
		  System.out.println("Order is not Done");
		}
		
	}
	  void getProductInfo()		
	{
        if (prodName != null) 
		{
            System.out.println("CustID: " + custID + " CustName: " + custName +
                    " Mobile Number: " + mobNo + " Product Name is: " + prodName);
        } 
		else 
		{
            System.out.println("Not valid order is  found");
        }
    }
	
}
class Cons
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Zomato ref1 = new Zomato(211, "Sita", 1234679689, "Pizza");
		ref1.getProductInfo();
		Zomato ref2 = new Zomato(215, "Gita", 1456239810, "Pasta");
		ref2.getProductInfo();
		System.out.println("Stop @ Cyber Success");
	}
}

//how to build Constructors in any food delivery application .	






