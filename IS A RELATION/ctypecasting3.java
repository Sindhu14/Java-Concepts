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
 class Demo3 extends Demo2
 {
	 char z='a';
	 void view()
	 {
		 System.out.println("running view()....");
 }
 }
	 class main3
	 {
	public static void main(String[] args) 
	{
		Demo3 d1=new Demo3();//used for demo2 class type and its super class;
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d1.z);
		d1.test();
		d1.display();
		d1.view();
		Demo2 d2= d1;//only used for demo1 class type;
	     System.out.println(d2.z);

		 d2.test();
		 d2.display();
		 Demo1 d3=d1;
		 System.out.println(d3.x);

		
	}
}
