class sample1
{
	sample1()
	{
	this(10);
	System.out.println("running no arguement constructor");
	}
	sample1(int arg)
		{
		System.out.println("running int arg constructor ");
		System.out.println("the arg value is "+arg);
		
		}
}
class main2

{
	public static void main(String[] args) 
	{
		sample1 s1=new sample1();
	}
}
