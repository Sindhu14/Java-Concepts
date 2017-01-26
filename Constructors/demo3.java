class demo3
{
  int x;
  double y;
    demo3 (int arg1,double arg2)
  {
  x=arg1;
  y=arg2;
 }
}

class main3
{
 public static void main(String[] args)
 {
  demo3 d1=new demo3(5,3.5);
  System.out .println(d1.x);
  System.out .println(d1.y);

  demo3 d2=new demo3(6,7.5);
    System.out .println(d2.x);
    System.out .println(d2.y);
  }
}

