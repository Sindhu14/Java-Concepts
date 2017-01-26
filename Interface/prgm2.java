interface Demo2
{
    void test();
	
}
 interface Demo3 extends Demo2
 {
	 void disp();
 }

 class Sample2 implements Demo3
 {
	public  void test()
	 {
     System.out.println("tset defined in sample2..");
	 }
	 public void disp()
	 {
		 System.out.println("disp defined in sample2..");
	 }
 }

 class main2
 {
	public static void main(String[] args) 
	{
		Demo3 d1=new Sample2();
		d1.test();
		d1.disp();
	
	}
}
