package ncet;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	static List<Employee> employees = new ArrayList<>();
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "id = " + id + ", name = " + name + ", dept = " + dept + "\n";
	}
	
	String getDetails() {
		return id+", "+name+", "+dept;
	}
	
	
}
