package com.review.revisao.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;




class HelloWordServiceTest {

    @Autowired
    @InjectMocks
    private HelloWordService helloWordService;

    private String nome;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        nome = "t3st3";
    }

    @Test
    @DisplayName("Retorna nome do usuário")
    void RetornaNomeUsuarioSucessdo() {

      String retorno = helloWordService.HelloWord(nome);

      Assertions.assertEquals("Hello! t3st3",retorno);
    }
}