package com.example.splitwise.commands.registry;

import com.example.splitwise.commands.Command;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandRegistryImpl implements CommandRegistry {
    private List<Command> commands = new ArrayList();
    @Override
    public void registerCommand(Command command) {
        commands.add(command);
    }

    @Override
    public Command getCommand(String commandLine) {
        for(Command command : commands) {
            if(command.parse(commandLine)) {
                return command;
            }
        }
        return null;
    }

    @Override
    public boolean executeCommand(String commandLine) {
        for(Command command : commands) {
            if(command.parse(commandLine)) {
                command.execute(commandLine);
                return true;
            }
        }
        return false;
    }
}
