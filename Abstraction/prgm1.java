abstract class  Demo1
{
	static int x=12;
	 int y=20;
	 static void run()
	{
       System.out.println("running run()....");
	}
	void test()
	{
		System.out.println("running test()...");
    }
	abstract void disp();
}
class main1
{

	public static void main(String[] args) 
	{
		//Demo1 d1=new Demo1();
		System.out.println(Demo1.x);
		Demo1.run();
	}
}
