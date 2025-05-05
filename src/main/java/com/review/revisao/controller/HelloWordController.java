package com.review.revisao.controller;

import com.review.revisao.domain.User;
import com.review.revisao.dto.UserDto;
import com.review.revisao.service.HelloWordService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    @Operation(description = "EndPoint responsável por retorna o nome usuário")
    @ApiResponse (responseCode = "200", description = "Solicitação Retornado com Sucesso")
    @ApiResponse(responseCode = "400",description = "Erro de requisição")
    @ApiResponse(responseCode = "500",description = "Erro Interno")
    public String helloWord(){
        log.info("Solicitação helloword recebida");
        return helloWordService.HelloWord("Usuario");
    }

    @PostMapping
    @Operation(description = "EndPoint responsável por retorna o nome de usuário passado por parâmetro ")
    @ApiResponse (responseCode = "200", description = "Solicitação Retornado com Sucesso")
    @ApiResponse(responseCode = "400",description = "Erro de requisição")
    @ApiResponse(responseCode = "500",description = "Erro Interno")
    public String helloWordPost(@Valid @RequestBody UserDto body){
        log.info("solicitação helloWordPost recebida nome: " + body.nome());
        return "Hello Word " + body.nome();
    }
}
