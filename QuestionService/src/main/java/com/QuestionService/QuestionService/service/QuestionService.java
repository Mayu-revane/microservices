package com.QuestionService.QuestionService.service;

import com.QuestionService.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question question);

    List<Question> get();

    Question getId(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);


}
