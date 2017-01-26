class sample2
{
	sample2(int arg)
	{   
		System.out.println("running sample2 constructor");
		 System.out.println("arg value is "+arg);
	}
}

class sample3 extends sample2
{
	sample3()
	{
    super(12);
   System.out.println("running sample3 constructor");
  
	}
}
  class main3
  {
  
	public static void main(String[] args) 
	{
		
		sample3 s1=new sample3();

	}
}
