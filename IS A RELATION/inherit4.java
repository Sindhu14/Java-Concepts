class x
{
	int a;
	x()
	{
		a=10;
		System.out.println(a);
	}
}
class Y extends x
{
	int b;
	Y()
	{
		b=30;
		System.out.println(b);
	}
}
 class main4
 {
 
	public static void main(String[] args) 
	{
		Y y1=new Y();
	}
}
