package com.eg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Assignment 2 & 3
abstract class Employee {
	
	String name;
	int age;
	double salary;
	
	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	static void staticMethod() {
		int i;
	}
	
	public abstract double getSalaryPerAnnum();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}

class PermanentEmployee extends Employee {
	
	double pf;
	double tax;
	
	PermanentEmployee(String name, int age, double salary, double pf, double tax) {
		super(name,age,salary);
		this.pf = pf;
		this.tax = tax;
	}
	
	@Override
	static void staticMethod() {
		int i;
	}
	
	@Override
	public double getSalaryPerAnnum() throws IOException  {
		return (this.salary*12 - this.pf*12 - this.tax*12);
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
}

class ContractEmployee extends Employee {
	
	int contractPeriod;
	
	ContractEmployee(String name, int age, double salary, int contractPeriod) {
		super(name,age,salary);
		this.contractPeriod =  contractPeriod;
	}
	
	public double getSalaryPerAnnum() {
		return this.salary*12;
	}

	public int getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	
	
	
}

public class EmployeeMain1 {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		
		Employee employee1 = new PermanentEmployee("emp1", 25, 20000, 1000, 0);
		Employee employee2 = new PermanentEmployee("emp2", 23, 18000, 800, 0);
		Employee employee3 = new PermanentEmployee("emp3", 35, 50000, 2000, 2000);
		Employee employee4 = new ContractEmployee("emp4", 27, 40000, 10);
		Employee employee5 = new ContractEmployee("emp5", 26, 37000, 10);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		Iterator<Employee> it = employeeList.iterator();
		
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("Employee:" + e.getName() + "'s salary is " + e.getSalaryPerAnnum());
		}
	}
}
