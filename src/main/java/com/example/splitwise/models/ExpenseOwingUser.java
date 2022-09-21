package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class ExpenseOwingUser extends BaseModel {
    @ManyToOne
    private User user;
    @ManyToOne
    private Expense expense;
    private double amount;
}
