class program5 
{
	static double waiter(double amt)
	{
		System.out.println("paying the bill is");
double change;
double billamount=1400.00;
change=amt-billamount;
return change;
	}
	public static void main(String[] args) 
	{
		System.out.println("Execution starts");
		double pocket;
pocket=waiter(1500);
System.out.println("return change is"+pocket);
System.out.println("Execution ends");

	}
}
