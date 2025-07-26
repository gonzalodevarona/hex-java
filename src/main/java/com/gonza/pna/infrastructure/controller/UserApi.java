package com.gonza.pna.infrastructure.controller;

import com.gonza.pna.infrastructure.controller.dto.UserRequest;
import com.gonza.pna.infrastructure.controller.dto.UserResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserApi {

    @PostMapping
    public UserResponse createUser(UserRequest userRequest);

    @PostMapping
    public UserResponse updateUser(UserRequest userRequest);

    @DeleteMapping
    public UserResponse deleteUser(Long id);

    @GetMapping
    public UserResponse getUser(Long id);
}
