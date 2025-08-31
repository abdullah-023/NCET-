package ncet;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class CreateEmployee {
public static void main(String[] args) throws IOException {

	FileWriter fw = new FileWriter("C:\\Users\\abdul\\Desktop\\abc.txt", true);
	Scanner sc = new Scanner(System.in);
	int id;
	String name, dept;
	
	System.out.println("Enter Employee Credentials: ");
	System.out.print("ID: ");
	id = sc.nextInt();
	
	System.out.print("Name: ");
	name = sc.next();
	
	System.out.print("Department: ");
	dept = sc.next();
	
	name=name.trim();
	dept=dept.trim();
	
	if(id>0 && name!="" && dept!="") {
		Employee.employees.add(new Employee(id, name, dept));
		fw.write(id + ", " + name + ", " + dept + "\n");
		System.out.println("employee added.");
	}
	else System.out.print("Invalid Inputs!");
	
	fw.close();
	sc.close();
	
}
}
