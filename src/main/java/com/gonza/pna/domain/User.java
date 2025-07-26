package com.gonza.pna.domain;

public record User(
        Long id,
        String name,
        String email,
        int age
) {
}
