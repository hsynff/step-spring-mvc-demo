package com.step.spring.mvc.service;

import com.step.spring.mvc.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentById(int id);
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
}
