package com.outlaystream.expensetracker.repository;

import com.outlaystream.expensetracker.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String username);
}
