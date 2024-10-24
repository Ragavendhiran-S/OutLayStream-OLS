package com.outlaystream.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name = "categories")
public class Category {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    private User user;
}
