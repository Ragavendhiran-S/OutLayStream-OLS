package com.outlaystream.expensetracker.dto;


import com.outlaystream.expensetracker.model.Category;
import com.outlaystream.expensetracker.model.User;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CategoryDTO {
    private Long id;

    private String name;

    private User user;

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
        this.user = category.getUser();

    }
}
