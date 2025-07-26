package com.gonza.pna.application.port.in;

import com.gonza.pna.application.service.dto.UserDtoRequest;
import com.gonza.pna.application.service.dto.UserDtoResponse;

public interface CrudUserUseCase {
    UserDtoResponse createUser(UserDtoRequest user);
    UserDtoResponse updateUser(UserDtoRequest user);
    UserDtoResponse getUserById(Long id);
    void deleteUserById(Long id);
}
