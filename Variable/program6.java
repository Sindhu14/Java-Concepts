class program6
{
	public static void main(String[] args) 
	{
		 int x1=10;
		 int x2=14;
		 int x3=18;
        System.out.println("value of x1 is" +x1);
		System.out.println("value of x2 is" +x2);
		System.out.println("value of x3 is" +x3);
		x2=x1; // copy the value of x1 to x2
		x3=x2; // copy the value of x2 to x3
		System.out.println("value of x1 is" +x1);
		System.out.println("value of x2 is" +x2);
		System.out.println("value of x3 is" +x3);
	}
}
