class notebook
{
 int code;
 double price;
String name;
String type;
 void display()
{
System.out.println("notebook code is "+code); 
System.out.println("notebook price is "+price); 
System.out.println("notebook brand is "+name); 
System.out.println("notebook type is "+type); 
}
}
 
class main5
{
 public static void main(String[] args)
 {
  notebook n1=new notebook();
    n1.code=111546;
    n1.name="classmate";
    n1.price=21.0;
    n1.type="rooled";
    n1.display();
}
}  