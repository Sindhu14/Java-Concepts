class demo2
{
  int x;
  double y;
   void demo2 ()
  {
  x=12;
  y=2.5;
 }
}

class main1
{
 public static void main(String[] args)
 {
  demo2 d1=new demo2();
  System.out .println(d1.x);
  System.out .println(d1.y);

  demo2 d2=new demo2();
    System.out .println(d2.x);
    System.out .println(d2.y);
  }
}

