class demo
{


	 int x=10;
	 double y=4.5;
	 void test()
	{
     System.out.println("Running test()....");
	}
 } 
class sample
{
	void display(demo arg)
	{
		System.out.println("Runnimg dispaly method().....");
		System.out.println("x value" +arg.x);
		System.out.println("y value" +arg.y);
		arg.test();
	}
 }

 class main1
 {
	public static void main(String[] args) 
	{
	sample s1=new sample();
	s1.display(new demo());
	}
}
