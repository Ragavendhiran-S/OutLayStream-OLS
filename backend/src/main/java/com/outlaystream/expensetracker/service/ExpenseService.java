package com.outlaystream.expensetracker.service;


import com.outlaystream.expensetracker.model.Expense;
import com.outlaystream.expensetracker.repository.ExpenseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class ExpenseService {

    ExpenseRepository expenseRepository;

    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }

    public ResponseEntity<Expense> get(Long id) {
        return expenseRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    public ResponseEntity<Expense> create(Expense expense) throws URISyntaxException {
        Expense result = expenseRepository.save(expense);
        URI location = new URI("/api/v1/expenses/" + result.getId()); // Fixed URI construction
        return ResponseEntity.created(location).body(result);
    }

    public ResponseEntity<Expense> update(Long id, Expense expense) {
        if (!expenseRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        expense.setId(id); // Set the ID for the expense being updated
        Expense updatedExpense = expenseRepository.save(expense);
        return ResponseEntity.ok(updatedExpense);
    }


    public ResponseEntity<Void> delete(Long id) {
        expenseRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
