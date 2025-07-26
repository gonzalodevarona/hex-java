package com.gonza.pna.application.port.in;

import com.gonza.pna.domain.User;

public interface CrudUser {
    User createUser(User user);
    User updateUser(User user);
    User getUserById(Long id);
    User deleteUserById(Long id);
}
