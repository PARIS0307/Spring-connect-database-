package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService (StudentRepository repository){
        this.repository = repository;
    }

    public Student createStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Student getStudentById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student updateStudent(Long id, Student updateStudent){
        Student student = getStudentById(id);
        student.setName(updateStudent.getName());
        student.setAge(updateStudent.getAge());
        return repository.save(student);
    }

    public void deleteStudent(Long id){
        repository.deleteById(id);
    }
}
