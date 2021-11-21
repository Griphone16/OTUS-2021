package com.otus.hw02.dao;

import com.otus.hw02.domain.Student;

public interface StudentDao {
    public Student getStudent(String firstName, String lastName);
}
