class NonStaticvar5
{
	int a;
	public static void main(String args[]){
		System.out.println("Start");
		NonStaticvar5 ref1=new NonStaticvar5();
		NonStaticvar5 ref2=new NonStaticvar5();
		System.out.println("Befor" +ref1.a);
		System.out.println("Befor" +ref2.a);
		ref1.a=10;
		ref2.a=20;
		System.out.println("After" +ref1.a);
		System.out.println("After" +ref2.a);
		System.out.println("Stop");
	}
}