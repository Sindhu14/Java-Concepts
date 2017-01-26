class Demo1 
{
	int x=10;
	void test()
	{
      System.out.println("running test()....");
	}
}

 class Demo2 extends Demo1
 {
	 double y=1.8;
	 void display()
	 {
		 System.out.println("running displ()....");
	 }
 }
	 class main3
	 {
	public static void main(String[] args) 
	{
		Demo2 d1=new Demo2();//used for demo2 class type and its super class;
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.test();
		d1.display();
		Demo1 d2= d1;//only used for demo1 class type;
	     System.out.println(d2.x);
		 d2.test();
		
	}
}
