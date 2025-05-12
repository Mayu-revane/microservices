package com.QuestionService.QuestionService.controller;


import com.QuestionService.QuestionService.entities.Question;
import com.QuestionService.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question add(@RequestBody Question question){

        return  questionService.add(question);

    }


    @GetMapping
    public List<Question>getAll(){
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question find(@PathVariable Long id){
        return questionService.getId(id);
    }


    @GetMapping("/QuizId/{Id}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long Id){
        return questionService.getQuestionOfQuiz(Id);
    }

}
