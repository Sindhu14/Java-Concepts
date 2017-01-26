class circle
{
 double rad;
 static final double pi = 3.14;
 void area()
 {  double a1;
    a1 = pi*rad*rad;
    System.out.println("Area is "+a1);
 }
void circu()
{ double c1;
  c1 = 2*pi*rad;
  System.out.println("Circumference is "+c1);
}
}
class main1
{
 public static void main(String[] args)
{
 circle c1,c2;
 c1 = new circle();
 c1.rad = 5.55;
 c1.area();
 c1.circu();
 c2 = new circle();
 c2.rad = 4.66;
 c2.area();
 c2.circu();
}
}