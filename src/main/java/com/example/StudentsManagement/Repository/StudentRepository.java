package com.example.StudentsManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentsManagement.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
