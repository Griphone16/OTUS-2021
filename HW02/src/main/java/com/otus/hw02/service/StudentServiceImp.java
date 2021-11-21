package com.otus.hw02.service;

import com.otus.hw02.dao.StudentDao;
import com.otus.hw02.dao.StudentDaoSimple;
import com.otus.hw02.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{

    private final StudentDao dao;

    @Autowired
    public StudentServiceImp(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student getStudent(String firstName, String lastName) {
        return dao.getStudent(firstName, lastName);
    }
}
