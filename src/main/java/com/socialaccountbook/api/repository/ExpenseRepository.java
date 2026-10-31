package com.socialaccountbook.api.repository;

import com.socialaccountbook.api.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
