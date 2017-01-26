class demo3
{
 int x=10;
double y=1.2;

}
class main
{
 public static void main(String[] args)
{
 demo3 d1=new demo3();
 System.out.println(d1.x);
 System.out.println(d1.y);
 demo3 d2;
d2=d1;
d1.x = 40;
d1.y = 8.3;
System.out.println(d2.x);
System.out.println(d2.y);
}
}