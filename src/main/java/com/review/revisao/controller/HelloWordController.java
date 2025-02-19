package com.review.revisao.controller;

import com.review.revisao.domain.User;
import com.review.revisao.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWord(){
        return helloWordService.HelloWord("Usuario");
    }

    @PostMapping
    public String helloWordPost(@RequestBody User body){
        return "Hello Word " + body.getNome();
    }
}
