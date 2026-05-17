package com.student.StudentManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.StudentManagement.Entity.Student;
import com.student.StudentManagement.Reposit.Reposit;

@org.springframework.stereotype.Service
public class StudentService {

    private final Reposit reposit;
	public StudentService(Reposit reposit)
	{
		this.reposit=reposit;
	}
	public boolean saveStudent(Student e)
	{
	   if(reposit.existsById(e.getId()))
		   return false;
	   reposit.save(e);
	   return true;
	}   
	public boolean updateStudent(Student e1)
	{
		if(reposit.existsById(e1.getId()))
		{
			reposit.save(e1);
			return true;
		}
		else return false;
		
			
	}
	public boolean deleteById(int id)
	{
		if(reposit.existsById(id))
		{
			reposit.deleteById(id);
			return true;
		}
		else  return false;		
		
	}
	public Student viewOne(int id)
	{
		
		return reposit.findById(id).orElse(null);	
	}
	public List<Student> viewAll()
	{
		return reposit.findAll();
	}
	
	
}
