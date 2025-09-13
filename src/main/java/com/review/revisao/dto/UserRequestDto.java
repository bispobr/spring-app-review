package com.review.revisao.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;



public record UserRequestDto(@NotBlank  String nome, @NotBlank @Email String email) {
}
