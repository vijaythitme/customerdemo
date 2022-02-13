package com.javabykiran.controller;
    // @Component
public class Employee  //Spring IOC Program
{
	int eno , salary;
	
	public Employee()
	{
		System.out.println("Default constructor");
	}
	
	public String toString()
	{
		return eno + " " + salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
