package com.gonza.pna.application.service.dto;

public record UserDtoRequest(
        Long id,
        String name,
        String email,
        int age
) {
}
