package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel {
    @ManyToOne
    private User createdBy;
    private String description;
    private double totalAmount;
    @ManyToOne
    private Currency baseCurrency;
    @ManyToMany
    private List<User> participants;
}
