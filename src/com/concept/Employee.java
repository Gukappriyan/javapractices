package com.concept;

public class Employee extends Person {
	
	private int empId;
	private String name;
	
	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId=id;
		this.name = nm;
	}

	@Override
	public void work() {
		if(empId == 0){
			System.out.println(name+": Not working");
		}else{
			System.out.println(name+": Working as employee!!");
		}
	}
	
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person student = new Employee("Dove","Female",0);
		Person employee = new Employee("Pankaj","Male",123);
		student.work();
		employee.work();
		//using method implemented in abstract class - inheritance
		employee.changeName("Pankaj Kumar");
		System.out.println(employee.toString());
	}

}