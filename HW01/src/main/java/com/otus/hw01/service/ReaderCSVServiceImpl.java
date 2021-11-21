package com.otus.hw01.service;

import com.otus.hw01.dao.ReaderCSVDao;
import com.otus.hw01.domain.Answer;
import com.otus.hw01.domain.Question;

import java.util.List;

public class ReaderCSVServiceImpl implements ReaderCSVService{
    private final ReaderCSVDao dao;

    public ReaderCSVServiceImpl(ReaderCSVDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Question> getAnswers() {
        return dao.getAnswers();
    }
}
