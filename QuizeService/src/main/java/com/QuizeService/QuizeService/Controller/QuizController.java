package com.QuizeService.QuizeService.Controller;

import com.QuizeService.QuizeService.entity.Quiz;
import com.QuizeService.QuizeService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
   public Quiz create(@RequestBody Quiz quiz){

        return quizService.add(quiz);

   }

   @GetMapping
   public List<Quiz>get(){
        return quizService.get();
   }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Quiz Service is reachable";
    }


}
