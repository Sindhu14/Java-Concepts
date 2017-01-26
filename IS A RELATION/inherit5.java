 class demo1 
{
	  void test()
	{
		System.out.println("running test() method");
	}
}
	class demo2 extends demo1
	{
		void test()
			{
		System.out.println("test() method overided in demo2");
			}
	}
	class demo3 extends demo2
	{
           void test()
			{
			   super.test();
		     System.out.println("test() method overided in demo3");
			}
	}
	class main5
	{
	public static void main(String[] args) 
	{
		demo3 d1=new demo3();
		d1.test();
	
	
		
	}
}
