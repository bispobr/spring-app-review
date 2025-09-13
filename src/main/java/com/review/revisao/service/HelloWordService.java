package com.review.revisao.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloWordService {
    public String HelloWord(String nome){
        if(nome != null){log.info("nome retornado com sucesso");}
        return "Hello! " + nome;

    }
}
