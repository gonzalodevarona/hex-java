package com.gonza.pna.application.service;

import com.gonza.pna.application.port.in.CrudUserUseCase;
import com.gonza.pna.application.port.out.UserRepositoryPort;
import com.gonza.pna.domain.User;
import com.gonza.pna.application.service.dto.UserDtoRequest;
import com.gonza.pna.application.service.dto.UserDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CrudUserService implements CrudUserUseCase {
    private UserRepositoryPort userRepositoryPort;


    @Override
    public UserDtoResponse createUser(UserDtoRequest user) {
        User createdUser = userRepositoryPort.createUser(new User(user.id(), user.name(), user.email(), user.age()));
        return new UserDtoResponse(createdUser.id(), createdUser.name(), createdUser.email(), createdUser.age());
    }

    @Override
    public UserDtoResponse updateUser(UserDtoRequest user) {
        User createdUser = userRepositoryPort.updateUser(new User(user.id(), user.name(), user.email(), user.age()));
        return new UserDtoResponse(createdUser.id(), createdUser.name(), createdUser.email(), createdUser.age());
    }

    @Override
    public UserDtoResponse getUserById(Long id) {
        Optional<User> user = userRepositoryPort.getUserById(id);
        if(user.isPresent()) {
            User foundUser = user.get();
            return new UserDtoResponse(foundUser.id(), foundUser.name(), foundUser.email(), foundUser.age());
        }else{
            throw new RuntimeException("User not found with id: " + id );
        }
    }

    @Override
    public void deleteUserById(Long id) {
        userRepositoryPort.deleteUserById(id);
    }
}
