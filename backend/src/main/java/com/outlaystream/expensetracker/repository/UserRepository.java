package com.outlaystream.expensetracker.repository;

import com.outlaystream.expensetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String username);
    boolean existsByName(String username);
}