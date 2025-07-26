package com.gonza.pna.infrastructure.controller;

import com.gonza.pna.application.service.dto.UserDtoRequest;
import com.gonza.pna.application.service.dto.UserDtoResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserApi {

    @PostMapping
    public UserDtoResponse createUser(UserDtoRequest userDtoRequest);

    @PostMapping
    public UserDtoResponse updateUser(UserDtoRequest userDtoRequest);

    @DeleteMapping
    public void deleteUser(Long id);

    @GetMapping
    public UserDtoResponse getUser(Long id);
}
