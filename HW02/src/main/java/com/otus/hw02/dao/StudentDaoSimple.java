package com.otus.hw02.dao;

import com.otus.hw02.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoSimple implements StudentDao{


    @Override
    public Student getStudent(String firstName, String lastName) {
        Student student= new Student();
        student.setLastName(lastName);
        student.setLastName(firstName);
        return student;
    }
}
