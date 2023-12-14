package com.nefel.pocketbook.services;

import com.nefel.pocketbook.models.Expense;
import com.nefel.pocketbook.repos.ExpenseRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepos expenseRepos;

    public Expense save(Expense expense){
        return expenseRepos.save(expense);
    }

    public Expense update(Expense expense){
        return expenseRepos.save(expense);
    }

    public void delete(Integer expenseId){
        expenseRepos.deleteById(expenseId);
    }

    public Expense get(Integer expenseId){
        return expenseRepos.findById(expenseId).get();
    }

    public List<Expense> getAll(){
        return expenseRepos.findAll();
    }
}
