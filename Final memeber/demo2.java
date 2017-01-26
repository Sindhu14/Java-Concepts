class demo2
{


	 int x=10;
	 double y=4.5;
	 void test()
	{
     System.out.println("Running test()....");
	}
 } 
class sample2
{
	demo2 display()
	{
		demo2 d1=new demo2();
		return d1;

	}
 }

 class mainclass2
 {
	public static void main(String[] args) 
	{
	sample2 s1=new sample2();
	demo2 obj=s1.display();
	System.out.println(obj.x);
	System.out.println(obj.y);
	obj.test();
	}
}
