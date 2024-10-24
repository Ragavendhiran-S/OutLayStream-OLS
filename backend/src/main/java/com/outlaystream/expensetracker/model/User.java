package com.outlaystream.expensetracker.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "user")
@AllArgsConstructor
public class User {

    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

}
