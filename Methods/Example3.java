 class Example3
{
    // Method with parameters and a return value
   static int add(int a, int b) 
	{
        return a + b;  // Returns the sum of two numbers
    }

    public static void main(String[] args) 
	{
        // Method call with arguments and store the return value
        int sum = add(10, 20);
        System.out.println("The sum is: " + sum);
    }
}
