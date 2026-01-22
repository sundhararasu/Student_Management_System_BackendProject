package com.example.StudentsManagement.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentsManagement.Entity.Student;
import com.example.StudentsManagement.Repository.StudentRepository;



@Service
public class StudentService{
	@Autowired
	public StudentRepository repository;
	
	public Student getStudentById(Long id) {
		return repository.findById(id).orElseThrow();
	}
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public void deleteStudent(Long id) {
		repository.deleteById(id);;
	}
	
	public Student updateStudentById(Long id,Student student) {
		 Student existing = repository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Student not found"));

	    existing.setName(student.getName());
	    existing.setEmail(student.getEmail());
	    existing.setCourse(student.getCourse());

	    return repository.save(existing);
	}
}
