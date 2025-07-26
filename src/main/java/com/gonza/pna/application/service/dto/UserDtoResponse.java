package com.gonza.pna.application.service.dto;

public record UserDtoResponse(
        Long id,
        String name,
        String email,
        int age
) {
}

