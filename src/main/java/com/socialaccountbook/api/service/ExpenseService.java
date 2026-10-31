package com.socialaccountbook.api.service;

import com.socialaccountbook.api.entity.Expense;
import com.socialaccountbook.api.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {
    // DB 작업을 요청하기 위해 레파지토리 객체 생성
    private final ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}