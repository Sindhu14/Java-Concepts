class student
{
 int id;
 int age;
String name;
String branch;
 void display()
{
System.out.println("student identi is "+id); 
System.out.println("student age is "+age); 
System.out.println("student name is "+name); 
System.out.println("student branch is "+branch); 
}
}
 
class main3
{
 public static void main(String[] args)
 {
  student s1=new student();
    s1.id=18;
    s1.name="salman";
    s1.age=21;
    s1.branch="cse";
    s1.display();
}
}  