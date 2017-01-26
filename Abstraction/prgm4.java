abstract class Demo3 
{
	abstract void test();
	abstract void disp();
}

abstract class sample3 extends Demo3
{
	void test()
	{
 System.out.println("test defined in sample3..");
    }
}
class sample4  extends sample3
{
	void disp()
	{
      System.out.println("disp defined in sample4");
    }
}
  class main4
  {
   public static void main(String[] args) 
	{
	   sample4 s1=new sample4();
	   s1.test();
	   s1.disp();
	}
}
