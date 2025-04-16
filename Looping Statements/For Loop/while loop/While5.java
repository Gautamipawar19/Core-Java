class While5
{
   public static void main(String args[])
   {
	int i=1;
	while(i<=5)
	{
	  System.out.println(i);
	  if(i==3)
	  {
	    System.out.println("the value of i is:" +i);
	    break;
	  }
	i++;
	}
   
   }
}