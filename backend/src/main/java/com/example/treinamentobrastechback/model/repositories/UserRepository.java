package com.example.treinamentobrastechback.model.repositories;

import com.example.treinamentobrastechback.model.entities.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByEmaiUser(String email);
}
