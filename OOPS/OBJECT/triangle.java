class triangle
{ 
 double s1,s2,s3;
 double b,h;

 void area()
 {
  double a1;
 a1=(1.0/2.0)*(b*h);
 System.out.println("Area is "+a1);
}
 void perim()
{
 double p1=s1+s2+s3;
  System.out.println("perimeter is "+p1);

}
}
class main2
{
 public static void main(String[] args)
{
 triangle t1=new triangle();
 t1.s1=4.0;
 t1.s2=4.0;
  t1.s3=4.0;
  t1.b=4.0;
  t1.h=3.6;
  t1.area();
  t1.perim();
}
}
 










