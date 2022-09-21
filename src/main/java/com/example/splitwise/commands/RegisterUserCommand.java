package com.example.splitwise.commands;

import java.util.Arrays;
import java.util.List;

public class RegisterUserCommand implements Command {
    @Override
    public boolean parse(String commandLine) {
        List<String> commandTokens = Arrays.stream(commandLine.split(" ")).toList();
        if(commandTokens.size() != 4) {
            System.out.println("not a register user command.");
            return false;
        }
        if(!commandTokens.get(0).equals(CommandKeywords.REGISTER_USER_COMMAND)) {
            System.out.println("not a register user command.");
            return false;
        }
        System.out.println("It's a register user command.");
        return true;
    }

    @Override
    public void execute(String commandLine) {

    }
}
