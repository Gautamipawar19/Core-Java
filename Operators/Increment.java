class Increment
{
  public static void main(String args[])
  {
	int i=1;
	System.out.println(i);//1
	//preincrement-> first increment the  i value + perform the operation(print)
	
	System.out.println(++i);//increment 2-> print-> 2
	
	System.out.println(i);//2
	//postincrement-> perform the operation(print) + first increment the  i value
	
	System.out.println(i++);//print->2->increment->3
		
	System.out.println(i);//3
  }

}