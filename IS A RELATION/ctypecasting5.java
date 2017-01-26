class  demo5
{
	int x=10;
	void test()
	{
      System.out.println("running test().....");
	}
}
class demo6 extends demo5
{
	double y=1.9;
	void display()
	{
		System.out.println("runing the display()...");
    }
}
 class demo7 extends demo5
 {
	 char z='k';
	 void view()
	 {
		 System.out.println("running view()....");
	 }
 }

class sample
{
	void useInstance(demo5 arg)
	{
		System.out.println(arg.x);
		arg.test();
		if (arg instanceof demo6)
		{
		
		demo6 d1=(demo6)arg;
		System.out.println(d1.y);
		d1.display();
       }
	   else if(arg instanceof demo7)
		{
		   demo7 d2=(demo7)arg;
       System.out.println(d2.z);
	   d2.view();
	    }
	}

}
 class main7
 {
 
	public static void main(String[] args) 
	{
		sample s1=new sample();
		//s1.useInstance(new demo5());
		s1.useInstance(new demo6());
		//s1.useInstance(new demo7());
	}
}
