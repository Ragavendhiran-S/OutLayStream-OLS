package com.outlaystream.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.outlaystream.expensetracker.model.Expense;


public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
