package com.student.StudentManagement.Reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.StudentManagement.Entity.Student;
@Repository
public interface Reposit extends JpaRepository<Student, Integer>{

}
