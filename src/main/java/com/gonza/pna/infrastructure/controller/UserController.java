package com.gonza.pna.infrastructure.controller;

import com.gonza.pna.infrastructure.controller.dto.UserRequest;
import com.gonza.pna.infrastructure.controller.dto.UserResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    @Override
    public UserResponse createUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserResponse updateUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserResponse deleteUser(Long id) {
        return null;
    }

    @Override
    public UserResponse getUser(Long id) {
        return null;
    }
}
