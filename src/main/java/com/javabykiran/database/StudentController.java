package com.javabykiran.database;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Spring contain hibernate
public class StudentController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	StudentController(){
		System.out.println("student contrroleer constructor called");
	}
	// http://localhost:8085/student/2
	
	// client gets state of object from Rest API in the form of JSON String
	// REST - Representional State Transfer 
	
	@RequestMapping("student/{rno}")
	public Student getStudent(@PathVariable("rno") int rno)
	{
		Session session = sessionFactory.openSession();
		Student student = session.load(Student.class, rno);
		return student;
	}
	
	@RequestMapping("student")
	public List<Student> getAllStudent()
	{
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> list=criteria.list();
		
		return list;
		
	}
	
	
	@PostMapping("student")
	public String saveStudent(@RequestBody Student student)
	{
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(student);
		
		transaction.commit();
		
		return "Record is addded";
		
	}
//  sid=3  sname=sachin sphone=345 -- database record
//{"sid":3,"sname":"rahul","sphone":"4567"}	---JSON String sent by postman
	@PutMapping("student")
	public String updateStudent(@RequestBody Student student)
	{
		// student==>[sid=3 sname=rahul sphone=4567] Student class object
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
//studentFromDataBase==> [sid=3  sname=rahul sphone=4567] Student class object
		Student studentFromDataBase = session.load(Student.class,student.getSid());
		
		studentFromDataBase.setSname(student.getSname());
		studentFromDataBase.setSphone(student.getSphone());
		
		session.update(studentFromDataBase);
		
		transaction.commit();
		
		return "Record is addded";
		
	}

// localhost:8085/student/1
	
	@DeleteMapping("student/{rno}")
	public String deleteStudent(@PathVariable int rno)
	{
		Session session = sessionFactory.openSession();
		Student student = session.load(Student.class, rno);
		Transaction transaction = session.beginTransaction();
		session.delete(student);
		transaction.commit();
		
		return "Record deleted";
	}
	

}
