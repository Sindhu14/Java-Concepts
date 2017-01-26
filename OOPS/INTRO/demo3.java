class demo2
{
	 int a=20;
	 double b=30.50;
	 void disp()
	{
		System.out.println("Running test().......");
	}
}
class mainclass2
{
	public static void main(String[] args) 
	{
		demo2 d1=new demo2();
		System.out.println("d1.a");
		System.out.println("d1.b");
		d1.disp();
		d1.a=35;
		d1.b=19;
		demo2 d2= new demo2();
		System.out.println("d1.a");
		System.out.println("d1.a");
	}
}
