package com.step.spring.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String surname;
    private String gender;
    private String course;

    public Student(String name, String surname, String gender, String course) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.course = course;
    }
}
