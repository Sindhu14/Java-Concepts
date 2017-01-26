abstract class  Demo3
{
	void test()
	{
		System.out.println("running test()...");
    }
	abstract void disp();
}
class sample1 extends Demo3
{
	void disp()
	{
		System.out.println("test defined in sample1");
    }

}
class main3
{

	public static void main(String[] args) 
	{
		
		System.out.println("program started....");
        //first way;
		sample1 s1=new sample1();
		s1.test();
		s1.disp();
        //second way;
		Demo3 d1=new sample1();
	    d1.test();
		d1.disp();
		System.out.println("program ended");
     }
}
