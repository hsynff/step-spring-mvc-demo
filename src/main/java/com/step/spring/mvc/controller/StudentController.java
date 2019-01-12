package com.step.spring.mvc.controller;

import com.step.spring.mvc.model.Student;
import com.step.spring.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public String allStudents(Model model) {
        List<Student> list = studentService.getAllStudent();

        model.addAttribute("list", list);
        return "students";
    }

    @RequestMapping("/students/{id}")
    public String getStudentById(@PathVariable("id") int id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "student-detail";
    }

    @GetMapping("/update-student")
    public String updateStudentPage(@RequestParam("id") int id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "student-detail";
    }

    @PostMapping("/update-student")
    public String updateStudent(@RequestParam("name") String name,
                                @RequestParam("surname") String surname,
                                @RequestParam("gender") String gender,
                                @RequestParam("course") String course,
                                @RequestParam("id")int id){
        studentService.updateStudent(new Student(id, name,surname,gender,course));

        return "redirect:/";
    }

    @GetMapping("/add-student")
    public String addStudentPage() {
        return "new-student";
    }

    @PostMapping("/add-student")
    public String addStudent(@RequestParam("name") String name,
                             @RequestParam("surname") String surname,
                             @RequestParam("gender") String gender,
                             @RequestParam("course") String course,
                             HttpSession session) {

        Student student = new Student(name, surname, gender, course);
        studentService.addStudent(student);
        session.setAttribute("message", "Student added!");
        return "redirect:/";
    }

    @RequestMapping("/delete-student")
    public String deleteStudent(@RequestParam("id") int id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }


}
