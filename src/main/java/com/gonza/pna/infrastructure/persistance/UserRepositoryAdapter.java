package com.gonza.pna.infrastructure.persistance;

import com.gonza.pna.application.port.out.UserRepositoryPort;
import com.gonza.pna.domain.User;

import java.util.Optional;

public class UserRepositoryAdapter implements UserRepositoryPort {

    private final SpringDataUserRepository userJpaRepository;

    public UserRepositoryAdapter(SpringDataUserRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public User createUser(User user) {
        UserEntity createdUser = userJpaRepository.save(
                new UserEntity(
                        user.id(),
                        user.name(),
                        user.email(),
                        user.age()
                )
        );
        return new User(createdUser.getId(), createdUser.getName(), createdUser.getEmail(), createdUser.getAge());
    }

    @Override
    public User updateUser(User user) {
        UserEntity existingUser = userJpaRepository.findById(user.id())
                .orElseThrow(() -> new RuntimeException("User not found with id: " + user.id()));

        existingUser.setName(user.name());
        existingUser.setEmail(user.email());
        existingUser.setAge(user.age());

        UserEntity updatedUser = userJpaRepository.save(existingUser);

        return new User(
                updatedUser.getId(),
                updatedUser.getName(),
                updatedUser.getEmail(),
                updatedUser.getAge()
        );
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userJpaRepository.findById(id)
                .map(userEntity -> new User(
                        userEntity.getId(),
                        userEntity.getName(),
                        userEntity.getEmail(),
                        userEntity.getAge()
                ));
    }

    @Override
    public void deleteUserById(Long id) {
        userJpaRepository.deleteById(id);
    }
}
