package com.review.revisao.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.review.revisao.dto.UserRequestDto;
import com.review.revisao.service.HelloWordService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class HelloWordControllerTest {

    @Mock
    HelloWordService helloWordService;

    @InjectMocks
    HelloWordController helloWordController;

    @Autowired
    MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();
    private UserRequestDto body;
    private UserRequestDto body2;

    @BeforeEach
    void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(helloWordController).build();
        body =  new UserRequestDto("Usuario","usuario@Usuario.com");
        body2 =  new UserRequestDto(" ","usuario@Usuario.com");
    }

    @Test
    @DisplayName("Retorna nome usuário")
    void DeveRetornar200HelloWord() throws Exception {

        when(helloWordService.HelloWord("Usuario")).thenReturn("Hello! Usuario ");

        mockMvc.perform(get("/hello-word"))
                .andExpect(status().isOk());


        verify(helloWordService,times(1)).HelloWord("Usuario");

    }

    @Test
    @DisplayName("Retorna nome do usuário")
    void deveretornar200helloWordPost() throws Exception {

        mockMvc.perform(post("/hello-word")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body)))
                        .andExpect(status().isOk());


        verify(helloWordService, times(1)).HelloWord(body.nome());
    }

    @Test
    @DisplayName("Teste campo em branco")
    void deveretornar400helloWordPost() throws Exception {

        mockMvc.perform(post("/hello-word")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body2)))
                .andExpect(status().isBadRequest());

    }
}