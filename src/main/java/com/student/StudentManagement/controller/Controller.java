package com.student.StudentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.student.StudentManagement.Entity.Student;
import com.student.StudentManagement.Service.StudentService;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@RestController
@RequestMapping("/api/Student")
public class Controller {

	private  final StudentService service;
	public Controller(StudentService service)
	{
		this.service=service;
	}
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Student s)
	{
		boolean result=service.saveStudent(s);
		if(result) {
			return ResponseEntity.ok("registered");
		}
		return ResponseEntity.ok("id alredy enter");
		
	}
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Student s)
	{
		boolean result=service.updateStudent(s);
		if(result)
		{
			return ResponseEntity.ok("updated");
		}
		return ResponseEntity.ok("id not found");
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		boolean result=service.deleteById(id);
		if(result)
		{
			return ResponseEntity.ok("id deleted");
			}
		return ResponseEntity.ok(" id not found");
		}
	@GetMapping("/{id}")
	public ResponseEntity<?> viewOnee(@PathVariable int id)
	{
		Student oneStudent=service.viewOne(id);
		if(oneStudent!=null)
		{
			return ResponseEntity.ok(oneStudent);
		}
		return ResponseEntity.ok("id is not found");				
	}
	@GetMapping("/all")
	public ResponseEntity<List<Student>> viewStudentsall()
	{
		return ResponseEntity.ok(service.viewAll());
	}
	/*
	@PostMapping("/StudentReg")
	public String  regStudent(@RequestParam("id") int id,
									@RequestParam("name") String name,
									@RequestParam("phno") long phno,
									HttpSession session)
	{
		
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setPhno(phno);
		boolean result=service.saveStudent(s);
		
		if(result)
		{
			session.setAttribute("object", s);
			session.removeAttribute("alrdy");
		}
		else {
			session.setAttribute("alrdy", "Id is alredy enter");
			session.removeAttribute("object");
		}
		
		
		return "indexResponse";
	}
	@PostMapping("/UpdateStudent")
	public String UpdateStudent(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("phno") long phno,
			HttpSession session)
	{
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setPhno(phno);
		boolean upresult=service.updateStudent(s);
		if(upresult)
		{
			session.setAttribute("object", s);
			session.removeAttribute("errormsg");
		}
		else {
			session.setAttribute("errormsg", "id is not found");
			session.removeAttribute("object");
		}
		
		return "updateResponse";
	}
	@PostMapping("/DeleteStudent")
	public String delteId(@RequestParam("id") int id,HttpSession session)
	{
		
		boolean delresult=service.deleteById(id);
		if(delresult)
		{
			session.setAttribute("id", id);
			session.removeAttribute("errormsg");	
		}
		else {
			session.setAttribute("errormsg", "id is not found");
			session.removeAttribute("id");
		}	
		return "deleteResponse";
	}
	@PostMapping("/ViewStudent")
	public String viewOne(@RequestParam("id") int id,HttpSession session)
	{
		Student OneStudent=service.viewOne(id);
		if(OneStudent!=null)
		{
			session.setAttribute("object",OneStudent);
			session.removeAttribute("ermsg");
		}
		else
		{
			session.setAttribute("ermsg", "id is not found");
			session.removeAttribute("object");
		}
		
		return "viewSrtudentResponse";
	}
	@GetMapping("/ViewAllStudents")
	public  String viewAll(HttpSession session)
	{
		List<Student> allStudents=service.viewAll();
		if(allStudents!=null)
		{
		  session.setAttribute("object", allStudents);
		  session.removeAttribute("nodata");
		}
		else {
			session.setAttribute("nodata", "no data is available");
			session.removeAttribute("object");
		}
		return "allStudentResponse";
	
	}*/

}
