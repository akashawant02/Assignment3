package CommandLineArgument;

import java.util.Scanner;

//wap to ask 5 employees record from user and display

public class ObjectArray {

	public static void main(String[] args) {

		System.out.println("enter number of employees");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
Emp e[]= new Emp[n];// 5 references 

for(int i=0;i<n;i++)
{   e[i]= new Emp();

	e[i].getData();
}
for(int i=0;i<n;i++)
{
	e[i].display();
}

	}

}
