class program4
{
	 static void a1(double base,double height)
	{
		System.out.println("Calculating area of triangle is ");
	System.out.println("base is"+base);
	System.out.println("height is"+height);	
	double a1;
	a1=0.5*base*height;

	System.out.println("area is"+a1);

	}
	public static void main(String[] args)
	{
		System.out.println("Execution starts.....");
		a1(10.0,5.0);
		a1(14.0,8.0);
		System.out.println("Execution ends......");
	}
}

