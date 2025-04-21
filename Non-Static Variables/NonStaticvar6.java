class NonStaticvar6
{
	byte b;
    long l;
    double d;
    char c;
    boolean flag;
    String st;
	short s;
	
		public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
	
		NonStaticvar6 refvar1 = new NonStaticvar6();
		System.out.println("Byte " +refvar1.b);
		NonStaticvar6 refvar2 = new NonStaticvar6();
		System.out.println("Long " +refvar2.l);
		NonStaticvar6 refvar3 = new NonStaticvar6();
		System.out.println("Double " +refvar3.d);
		NonStaticvar6 refvar4= new NonStaticvar6();
		System.out.println("Char " +refvar4.c);
		NonStaticvar6 refvar5 = new NonStaticvar6();
		System.out.println("Boolean " +refvar5.flag);
		NonStaticvar6 refvar6 = new NonStaticvar6();
		System.out.println("String " +refvar6.st);
		NonStaticvar6 refvar7 = new NonStaticvar6();
		System.out.println("Short " +refvar7.s);
		System.out.println("Stop @ cyber Sucess");
	}
}