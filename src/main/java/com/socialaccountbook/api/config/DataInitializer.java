package com.socialaccountbook.api.config;

import com.socialaccountbook.api.entity.Expense;
import com.socialaccountbook.api.repository.ExpenseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initData(ExpenseRepository repository) {
        return args -> {
            if(repository.count() == 0) {
                repository.save(new Expense(
                        new BigDecimal("12000"),"식비", LocalDate.of(2026, 10, 31)
                ));

                repository.save(new Expense(
                        new BigDecimal("3500"),"교통비", LocalDate.of(2026, 10, 30)
                ));
            }
        };
    }
}
