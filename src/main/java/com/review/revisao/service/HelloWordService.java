package com.review.revisao.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {
    public String HelloWord(String nome){
        return "Hello! " + nome;
    }
}
