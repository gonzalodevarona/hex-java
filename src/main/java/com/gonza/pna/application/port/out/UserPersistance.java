package com.gonza.pna.application.port.out;

import com.gonza.pna.domain.User;

public interface UserPersistance {

    User createUser(User user);
    User updateUser(User user);
    User getUserById(Long id);
    User deleteUserById(String username);

}
