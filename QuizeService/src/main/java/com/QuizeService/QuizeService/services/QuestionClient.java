package com.QuizeService.QuizeService.services;


import com.QuizeService.QuizeService.entity.Question;
import jakarta.persistence.Id;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "question-service", url = "http://localhost:8082")
public interface QuestionClient {


    //calling service  of question

    @GetMapping("/question/QuizId/{Id}")
    List<Question> getQuestionOfQuiz(@PathVariable Long Id);


}
