package com.gonza.pna.infrastructure.persistance;

import com.gonza.pna.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class UserRepository implements JpaRepository<User, Long> {
}
