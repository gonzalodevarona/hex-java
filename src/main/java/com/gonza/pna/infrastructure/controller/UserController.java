package com.gonza.pna.infrastructure.controller;

import com.gonza.pna.application.port.in.CrudUserUseCase;
import com.gonza.pna.application.service.dto.UserDtoRequest;
import com.gonza.pna.application.service.dto.UserDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController implements UserApi {

    private CrudUserUseCase crudUserUseCase;

    @Override
    @PostMapping
    public UserDtoResponse createUser(UserDtoRequest userDtoRequest) {
        return crudUserUseCase.createUser(userDtoRequest);
    }


    @Override
    @PutMapping
    public UserDtoResponse updateUser(UserDtoRequest userDtoRequest) {
        return crudUserUseCase.updateUser(userDtoRequest);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        crudUserUseCase.deleteUserById(id);
    }

    @Override
    @GetMapping("/{id}")
    public UserDtoResponse getUser(@PathVariable Long id) {
        return crudUserUseCase.getUserById(id);
    }
}
