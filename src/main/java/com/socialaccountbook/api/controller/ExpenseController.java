package com.socialaccountbook.api.controller;

import com.socialaccountbook.api.entity.Expense;
import com.socialaccountbook.api.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {
    private final ExpenseService expenseService;

    @GetMapping
    public List<Expense> getExpenses() {
        return expenseService.getAllExpenses();
    }
}
