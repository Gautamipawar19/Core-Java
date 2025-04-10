class Switch14
{
  public static void main(String args[])
  {
	 System.out.println("Start @ cyber success");
	   byte s=127;
	   switch(s)
		   {
			case 126:System.out.println("inside 126");
				   break;
				
			case 127:System.out.println("inside 127");
				 break;
				
			case 128:System.out.println("inside 128");
				 break;
				 
			default:System.out.println("inside default case");
				 break;
		   }
	System.out.println("Stop @ cyber success");	
  }
}
//The switch statements will except arguments like int,char,byte,short.
//The switch statements will not except arguments like long,float,double,boolean.