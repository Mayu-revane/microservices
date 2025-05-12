package com.QuestionService.QuestionService.service;

import com.QuestionService.QuestionService.entities.Question;
import com.QuestionService.QuestionService.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
//                .stream()
//                .peek(question -> {
//                    System.out.println(question);
//                    System.out.println("question id : " + question.getQuestionId());
//                    System.out.println("question : " + question.getQuestion());
//                    System.out.println("quiz id : " + question.getQuizId());
//                }).collect(Collectors.toList());
    }

    @Override
    public Question getId(Long id) {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("question is not found"));
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
