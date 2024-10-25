package com.outlaystream.expensetracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users") // Rename this to "users" to avoid conflict
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates ID
    private Long id;

    private String username;
    private String email;
    private String password;
}
