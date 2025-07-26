package com.gonza.pna.infrastructure.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataUserRepository extends JpaRepository<UserEntity, Long> {
}
