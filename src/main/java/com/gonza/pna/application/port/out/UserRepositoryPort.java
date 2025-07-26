package com.gonza.pna.application.port.out;

import com.gonza.pna.domain.User;

import java.util.Optional;

public interface UserRepositoryPort {

    User createUser(User user);
    User updateUser(User user);
    Optional<User> getUserById(Long id);
    void deleteUserById(Long id);

}
