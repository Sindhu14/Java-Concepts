class pen
{
 int code;
 double price;
String brand;
String colour;
 void display()
{
System.out.println("pen code is "+code); 
System.out.println("pen price is "+price); 
System.out.println("pen brand is "+brand); 
System.out.println("pen colour is "+colour); 
}
}
 
class main4
{
 public static void main(String[] args)
 {
  pen p1=new pen();
    p1.code=111456;
    p1.brand="cello";
    p1.price=21.0;
    p1.colour="Black";
    p1.display();
}
}  