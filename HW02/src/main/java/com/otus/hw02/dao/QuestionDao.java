package com.otus.hw02.dao;

import com.otus.hw02.domain.Answer;

import java.util.List;

public interface QuestionDao {
    List<Answer> getAnswers();
}
