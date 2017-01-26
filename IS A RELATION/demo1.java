class demo1
{
  int x=10;
  void test()
  {
   System.out.println("test is running..");
   }
}

class demo2 extends demo1
{
  double y=1.6;
  void display()
  {
  System.out.println("display() running...");
  }
}

 class main
 {
   public static void main(String[] args)
   {
     demo2 d1=new demo2();
     System.out.println(d1.x);
     System.out.println(d1.y);
     d1.test();
     d1.display();
     }
    }