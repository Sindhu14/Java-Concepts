import java.util.Scanner;
class Student
{
	String name;
	String id;
	Student(String arg1,String arg2)
	{
		name=arg1;
		id=arg2;
	}
}


class Faculty
{
	String name;
	String id;
	int exp;
	Faculty(String arg1,String arg2, int arg3)
	{
		name=arg1;
		id=arg2;
		exp=arg3;
	}
}


class Library
{
	String librarian;
	String type;
	Library(String arg1, String arg2)
	{
		librarian=arg1;
		type=arg2;
	}
}



class Department
{
	String DeptName;
	int index=0;
	Student[] stArr;
	Department(String arg1, int strength)
	{
		DeptName=arg1;
		stArr=new Student[strength];
	}
	void addStudent(Student s1)
	{
		if(index<stArr.length)
		{
			stArr[index++]=s1;
			System.out.println("Admissission success, admitted to "+DeptName+" department");
			System.out.println();
		}
		else
			System.out.println("No Admissions available");
	}

	void viewStudents()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Name \t ID");
		    System.out.println();
			System.out.println(stArr[i].name+"\t"+stArr[i].id);
			System.out.println();
		}
	}
}


class College
{
	String name;
	College(String arg)
	{
		name=arg;
	}
   Department cs=new Department("CS",50);
   Department ec=new Department("EC",60);
   Department mech=new Department("Mechanical",45);
}



class CollegeMain
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		College c=new College("Jspiders");
		System.out.println("----Welcome to jspiders------");
		System.out.println();
		for(;;)
		{

			System.out.println("Press 1 for new admission");
			System.out.println("Press 2 for viewing Students records");
			System.out.println("press 3 for exit");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("New Admission");
				System.out.println("Enter student name");
				String name=sc.next();
				System.out.println("Enter student ID");
				String id=sc.next();
				System.out.println("1 : CS Department Admission");
				System.out.println("2 : EC Department Admission");
				System.out.println("3 : Mechanical Department Admission");
				int ch2=sc.nextInt();
				switch(ch2)
				{

					case 1: c.cs.addStudent(new Student(name,id));break;
					case 2: c.ec.addStudent(new Student(name,id));break;
					case 3: c.mech.addStudent(new Student(name,id));break;
				}
			}
			else if(ch==2)
			{
				System.out.println("Viewing students records");
				System.out.println("1 : CS Department Records");
				System.out.println("2 : EC Department Records");
				System.out.println("3 : Mechanical Department Records");
				int ch2=sc.nextInt();
				switch(ch2)
				{
					case 1: c.cs.viewStudents();break;
					case 2: c.ec.viewStudents();break;
					case 3: c.mech.viewStudents();break;
				}
			}
			else
				System.exit(0);
		}
	}
}
