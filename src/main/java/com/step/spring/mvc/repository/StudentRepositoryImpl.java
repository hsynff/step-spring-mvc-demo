package com.step.spring.mvc.repository;

import com.step.spring.mvc.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static final List<Student> list = new ArrayList<>();
    private static int idSequence = 5;

    static {
        list.add(new Student(1, "John", "Tomson", "Male", "Java"));
        list.add(new Student(2, "Merry", "Krimson", "Female", "Web"));
        list.add(new Student(3, "Kennedy", "Gilmour", "Male", "Java"));
        list.add(new Student(4, "David", "Cop", "Male", "Design"));
        list.add(new Student(5, "Memmed", "Eliyev", "Male", "Design"));
    }


    @Override
    public List<Student> getAllStudent() {
        return list;
    }

    @Override
    public Student getStudentById(int id) {
        return list.stream()
                .filter(s -> s.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void addStudent(Student student) {
        student.setId(++idSequence);
        list.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        Student student = getStudentById(id);

        list.removeIf(s -> s.getId()==id);
    }

    @Override
    public void updateStudent(Student student) {
        Student oldStudent = getStudentById(student.getId());

        oldStudent.setName(student.getName());
    }
}
