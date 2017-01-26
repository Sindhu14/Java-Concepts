import java.util.Scanner;
class Manager
{
	String name;
	String id;
	Manager(String arg1,String arg2)
	{
		name=arg1;
		id=arg2;
	}
}
class Employee
{
	String name;
	String id;
	Employee(String arg1,String arg2)
	{
		name=arg1;
		id=arg2;
	}
}
class Department
{
	String name;
	Manager man;
	Employee[] emp;
	int index;
	Department(String arg1,int strength,Manager arg2)
	{
		name=arg1;
		emp=new Employee[strength];
		man=arg2;
	}

	void addEmployee(Employee e)
	{
		if(index<emp.length)
		{
			emp[index++]=e;
			System.out.println("employee added to "+name+" department");
			System.out.println();
		}
		else
			System.out.println("Department is full");
	}
	void displayDepartment()
	{
		System.out.println("Manager is "+man.name);
		System.out.println("Name \t ID");
		for(int i=0;i<index;i++)
		{
			System.out.println(emp[i].name+"\t"+emp[i].id);
			System.out.println();
		}
	}
}

class Organization
{
	Department sales=new Department("Sales",50,new Manager("Ganesh","123"));
    Department marketing=new Department("Marketing",60,new Manager("Praveen","124"));
    Department finance=new Department("Finance",10,new Manager("Siddu","125"));
	Department production=new Department("Production",45,new Manager("Paramesh","126"));

}
class OrganizationMain
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		Organization o=new Organization();
		System.out.println("----Welcome to jsp------");
		System.out.println();
	
		{

			System.out.println("Press 1 to add new employee");
			System.out.println("Press 2 to view all employees");
			System.out.println("press 3 for exit");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("New Enrollment");
				System.out.println("Enter employee name");
				String name=sc.next();
				System.out.println("Enter employee ID");
				String id=sc.next();
				System.out.println("Select department");
				System.out.println("1 : Sales Department Enrollment");
				System.out.println("2 : Marketing Department Enrollment");
				System.out.println("3 : Finance Department Enrollment");
				System.out.println("3 : Production Department Enrollment");
				int ch2=sc.nextInt();
				switch(ch2)
				{

					case 1: o.sales.addEmployee(new Employee(name,id));break;
					case 2: o.marketing.addEmployee(new Employee(name,id));break;
					case 3: o.finance.addEmployee(new Employee(name,id));break;
					case 4: o.production.addEmployee(new Employee(name,id));break;

				}
			}
			else if(ch==2)
			{
				System.out.println("Viewing Department records");
				System.out.println("Select department");
				System.out.println("1 : Sales Department");
				System.out.println("2 : Marketing Department");
				System.out.println("3 : Finance Department");
				System.out.println("3 : Production Department");		
				int ch2=sc.nextInt();
				switch(ch2)
				{
					case 1: o.sales.displayDepartment();break;
					case 2: o.marketing.displayDepartment();break;
					case 3: o.finance.displayDepartment();break;
					case 4: o.production.displayDepartment();break;					
				}
			}
			else
				System.exit(0);
		}
	}
}
