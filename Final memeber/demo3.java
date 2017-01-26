class officeboy
{
  void displayonnteboard(Student arg)
	{
     System.out.println(arg.name);
	 System.out.println (arg.id);
	 System.out.println("contact hod immediately");
	}
 } 
class hod
{
	void callofficeboy()
	{
		officeboy o1=new officeboy();
		Student s1=new Student(12345,"kalia");
	    o1.displayonnteboard(s1);
    }
 }

class Student
{
	int id;
	String name;
	Student(int arg1,String arg2)
	{
	 id=arg1;
	 name=arg2;
    }

}

 class mainclass3
 {
	public static void main(String[] args) 
	{
	hod h1=new hod();
    h1.callofficeboy();
	}
}
