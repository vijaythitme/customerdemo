 package com.javabykiran.controller;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
  import java.util.Scanner;
  import org.springframework.web.bind.annotation.CrossOrigin;
  import org.springframework.web.bind.annotation.DeleteMapping;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.PostMapping;
  import org.springframework.web.bind.annotation.PutMapping;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RestController;
//HTTP methods :-  get , post , put , delete...
//@RequestMapping is for all http methods

@CrossOrigin(origins = {"http://localhost:8080/loginappusingservlet/index.html"})
@RestController
@RequestMapping("api")
public class StudentAPI 
{
	List<Student>  list=new ArrayList();
	//http://localhost:8082/api/display
	@RequestMapping("display")
	String display()
	{
		return "Java is easy";
	}	
	StudentAPI()
	{
		list.add(new Student(1,90));
		list.add(new Student(2,80));
		
		// al-->[Student1 object,Student2 object] ArrayList object
	}
	
	@GetMapping("allStudents")
	List<Student>  allStudents()
	{
		return list;
	}
// JSON (JavaScript Object Notation)
// JSON is a string writtern according to javascript object syntax.
//http://localhost:8082/student/1
// {"rno":1,"marks":90}  - JSON String
// @PathVariable annoation assign value of path variable to local variable
//@GetMapping("student/{rno}") . rno is path variable 
//al.add(new Student(1,90));
//al.add(new Student(2,80));
	
// al-->[(rno=1 marks=90),(rno=2 marks=80)] ArrayList object
	
//http://localhost:8082/student/1
	@GetMapping("student/{rno}")
	Student getStudent(@PathVariable int rno)
	{
			Student stu = null;
			for(Student student : list)
			{
				if(student.rno==rno)
				{
					stu=student;
					break;
				}
			}
		return stu;
	}
	
	
	
	
/* @RequestBody annoattion will create object of Student class using json string data sent by client ( postman )  
 * {"rno":3,"marks":80}
 * */

	@PostMapping("student")
	List<Student> addStudent(@RequestBody Student student)
	{
			
		list.add(student);
			
		System.out.println(list);
		
		return list;
	}
	
	/* {"rno":3,"marks":100} this JSON string will be sent by client  */
	//clientStudent==>[rno=3 marks=100]  Student class object
	@PutMapping("student")
	String updateStudent(@RequestBody Student clientStudent)
	{
		Student stu=null;
		
		for(Student student:list)
		{
			if(student.rno==clientStudent.rno)
			{
				stu=student;
							
			}
		}
				
		stu.setMarks(clientStudent.marks);
		
		System.out.println(list);

		return "Student updated in arraylist";
	}
	
	//student/1
	@DeleteMapping("student/{rno}")
	String deleteStudent(@PathVariable int rno)
	{
			
			    Student stu=null;
			
				for(Student student:list)
				{
					if(student.rno==rno)
					{
					stu=student;
					}
				}
				
				list.remove(stu);
				System.out.println(list);
			  return "Student deleted from  arraylist";
	}

}//class ends
// client  - browser 

// server- tomcat server

// localhost:8080/display