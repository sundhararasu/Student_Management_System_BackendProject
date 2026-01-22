package com.example.StudentsManagement.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentsManagement.Entity.Student;
import com.example.StudentsManagement.Service.StudentService;

@RestController
@RequestMapping("/stud")
public class StudentController {
		@Autowired
		public StudentService service;
		
		@PostMapping
		public Student addStudent(@RequestBody Student student) {
			return service.saveStudent(student);
		}
		
		@GetMapping("/{id}")
		public Student getById(@PathVariable Long id) {
			return service.getStudentById(id);
		}
		
		@DeleteMapping("/{id}")
		public void deleteById(@PathVariable Long id) {
			service.deleteStudent(id);
		}
		@PutMapping("/{id}")
		public Student updateStudent(@PathVariable Long id,
									  @RequestBody Student student) {
			return service.updateStudentById(id, student);
		}
}


