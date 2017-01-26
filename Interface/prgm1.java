interface Demo1
{
   abstract	 void test();
	abstract void disp();
}

 class Sample1 implements Demo1
 {
	public  void test()
	 {
     System.out.println("tset defined in sample1..");
	 }
	 public void disp()
	 {
		 System.out.println("disp defined in sample1..");
	 }
 }

 class main1
 {
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.test();
		s1.disp();
	
	}
}
