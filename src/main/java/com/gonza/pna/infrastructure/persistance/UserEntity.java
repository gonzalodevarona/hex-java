package com.gonza.pna.infrastructure.persistance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public final class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private int age;
}
