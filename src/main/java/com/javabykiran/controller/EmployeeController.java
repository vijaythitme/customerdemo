package com.javabykiran.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController       //Spring IOC Program
@RequestMapping("employeeApi")
public class EmployeeController 
{
	@Value("${id}")
	int id;
	
	@Autowired
	    @Qualifier("e1")
	Employee employee;
	
	      @RequestMapping("employee")
	String display()
	{
		  System.out.println("id from properties file " + id);
		return employee.toString();
	}
	
	@Bean    ("e1")
	public Employee getEmployee()
	{
		Employee employee = new Employee();
		employee.setEno(1);
		employee.setSalary(1000);		
		return employee;
		
	}	
	
	@Bean("e2")
	public Employee getEmployees()
	{
		Employee employee = new Employee();
		employee.setEno(2);
		employee.setSalary(2000);
				return employee;
		
	
	}
}
