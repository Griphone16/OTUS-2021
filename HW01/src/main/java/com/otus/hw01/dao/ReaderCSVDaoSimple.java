package com.otus.hw01.dao;

import com.otus.hw01.domain.Answer;
import com.otus.hw01.domain.Question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderCSVDaoSimple implements ReaderCSVDao{

    private String fileCSV;

    public String getFileCSV() {
        return fileCSV;
    }

    public void setFileCSV(String fileCSV) {
        this.fileCSV = fileCSV;
    }

    @Override
    public List<Question> getAnswers() {
        List<Question> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileCSV));
            String line = null;
            Scanner scanner = null;
            int index = 0;
            while ((line = reader.readLine()) != null ) {

                scanner = new Scanner(line);
                scanner.useDelimiter(";");
                Answer answer = null;
                Question question = new Question();
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0)
                        question.setText(data);
                    else if (index == 1){
                        answer = new Answer();
                        answer.setText(data);}
                    else if (index == 2)    {
                        answer.setCorrectAnswer(Boolean.parseBoolean(data));
                        question.addAnswers(answer);
                    }
                    else if (index == 3){
                        answer = new Answer();
                        answer.setText(data);}
                    else if (index == 4)    {
                        answer.setCorrectAnswer(Boolean.parseBoolean(data));
                        question.addAnswers(answer);
                    }
                    else if (index == 5){
                        answer = new Answer();
                        answer.setText(data);}
                    else if (index == 6)    {
                        answer.setCorrectAnswer(Boolean.parseBoolean(data));
                        question.addAnswers(answer);
                    }
                    index++;
                }
                index = 0;
                result.add(question);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        List<Question> listQuestions = new ArrayList<>();
//        listQuestions.add(new Question("Сколько будет 2+2"));
//        listQuestions.add(new Question("Сколько будет 50/5"));
//        listQuestions.add(new Question("Сколько будет 100*200"));

        return result;
    }
}
