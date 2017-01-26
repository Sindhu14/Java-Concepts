class program3
{
	 static void square(int n)
	{
		System.out.println("Calculating square of "+n);
		int res;
		res=n*n;

		 
	System.out.println("Result of square is"+res);
	}
	public static void main(String[] args)
	{
		System.out.println("Execution starts.....");
		square(5);
		square(9);
		System.out.println("Execution ends......");
	}
}

