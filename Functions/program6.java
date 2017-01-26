class program6
{
	static void area(double radius)
	{
		System.out.println("calculation of area of circle");
		System.out.println("radius is"+radius);
double a1;
a1=3.14*radius*radius;
System.out.println("area is"+a1);
	}
	static void circumference(double radius)
	{
		System.out.println("calculation of circumference of circle");
		System.out.println("radius is"+radius);
		double c1;
c1=2*3.14*radius;
System.out.println("circumference is"+c1);
	}
	public static void main(String[] args) 
	{
		System.out.println("Execution starts");
		area(5);
circumference(5);

System.out.println("Execution ends");

	}
}
