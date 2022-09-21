package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "groups")
public class Group extends BaseModel {
    private String name;
    private String description;
    @ManyToOne
    private User createdBy;
    @ManyToMany
    private List<User> admins;
    @OneToMany
    private List<Expense> expenses;
    @ManyToMany
    private List<User> participants;
}
