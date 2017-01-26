interface Demo4
{
    void test();
	
}
 interface Demo5 
 {
	 void test();
 }

 class Sample3 implements Demo4,Demo5
 {
	public  void test()
	 {
     System.out.println("tset defined in sample2..");
	 }
	/* public void disp()
	 {
		 System.out.println("disp defined in sample2..");
	 }*/
 }

 class main3
 {
	public static void main(String[] args) 
	{
	Sample3 s1=new Sample3();
		s1.test();
		//s1.disp();
	
	}
}
