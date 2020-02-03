package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.data.QuestionRepository;
import com.demo.owlElectronics.model.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= {"http://localhost:3000"})
@RequestMapping(path="/question")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping(path="/place")
    public void setQuestion(@RequestBody Question question){
        questionRepository.save(question);
    }

}
