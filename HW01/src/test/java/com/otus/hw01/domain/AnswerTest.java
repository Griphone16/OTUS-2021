package com.otus.hw01.domain;

import com.otus.hw01.service.ReaderCSVService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    public Answer answer;
    @BeforeEach
        public  void setUpAnswer(){
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("/spring-context.xml");
    answer = context.getBean(Answer.class);
    }


    @Test
    void getText() {
    }

    @Test
    void setText() {
        answer.setText("123");
        assertEquals(answer.getText(), "123");
    }
}