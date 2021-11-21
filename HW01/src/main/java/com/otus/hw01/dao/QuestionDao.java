package com.otus.hw01.dao;

import com.otus.hw01.domain.Answer;

import java.util.List;

public interface QuestionDao {
    List<Answer> getAnswers();
}
