package com.outlaystream.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.outlaystream.expensetracker.model.Expense;
import org.springframework.stereotype.Repository;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
