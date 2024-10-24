package com.outlaystream.expensetracker.dto;

import com.outlaystream.expensetracker.model.Category;
import com.outlaystream.expensetracker.model.Expense;
import com.outlaystream.expensetracker.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Getter
@NoArgsConstructor
public class ExpenseDTO {
    private Long id;

    private Instant expenseDate;

    private String description;

    private String location;

    private Category category;

    private User user;

    public ExpenseDTO(Expense expense) {
        this.id = expense.getId();
        this.expenseDate = expense.getExpenseDate();
        this.description = expense.getDescription();
        this.location = expense.getLocation();
        this.category = expense.getCategory();
        this.user = expense.getUser();
    }

}
