package com.example.splitwise.commands;

public interface Command {
    boolean parse(String commandLine);
    void execute(String commandLine);
}
