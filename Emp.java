package CommandLineArgument;

import java.util.Scanner;

class Emp
{
	String name;
	int age;
	int empid;
	public void getData()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter name ,age and empid");
		name= s.next();
		age=s.nextInt();
		empid=s.nextInt();
	}
	
	public void display()
	{
		System.out.println(name + "  "+ age+"    "+ empid );
	}
}

