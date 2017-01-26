abstract class  Demo2
{
	void test()
	{
		System.out.println("running test()...");
    }
}
class sample1 extends Demo2
{

}
class main2
{

	public static void main(String[] args) 
	{
		
		System.out.println("program started....");
        //first way;
		sample1 s1=new sample1();
		s1.test();
        //second way;
		Demo2 d1=new sample1();
	    d1.test();
		System.out.println("program ended");
     }
}
