class x
{
 void wish()
	{
      System.out.println("hi");
	}
}
class y extends x
{
  void wish()
	{
      System.out.println("bye");
	}
}
 class main7
 {
	public static void main(String[] args) 
	{
		x x1=new y();//object is subclass object;
		x1.wish();
}
 }