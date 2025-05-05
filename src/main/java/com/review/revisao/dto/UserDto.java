package com.review.revisao.dto;

import jakarta.validation.constraints.NotBlank;



public record UserDto(@NotBlank  String nome, @NotBlank String email) {
}
