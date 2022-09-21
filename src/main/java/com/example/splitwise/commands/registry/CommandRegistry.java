package com.example.splitwise.commands.registry;

import com.example.splitwise.commands.Command;

public interface CommandRegistry {
    public void registerCommand(Command command);
    public Command getCommand(String commandLine);
    public boolean executeCommand(String commandLine);
}
