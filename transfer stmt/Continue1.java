class Continue1
{
 public static void main(String args[])
 {
   System.out.println("Start");
   for(int i=1;i<=5;i++)
   {
    if(i==3)
    {
     System.out.println("The value of i is:"+i);
     continue;
     
    }
    System.out.println(i);
   }
   System.out.println("Stop");
 }
}
//continue work as skip statement.