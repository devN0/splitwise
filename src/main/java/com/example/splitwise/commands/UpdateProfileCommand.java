package com.example.splitwise.commands;

import java.util.Arrays;
import java.util.List;

public class UpdateProfileCommand implements Command {
    @Override
    public boolean parse(String commandLine) {
        List<String> commandTokens = Arrays.stream(commandLine.split(" ")).toList();
        if(commandTokens.size() != 3) {
            System.out.println("not a update profile command.");
            return false;
        }
        if(!commandTokens.get(1).equals(CommandKeywords.UPDATE_PROFILE_COMMAND)) {
            System.out.println("not a update profile command.");
            return false;
        }
        System.out.println("It's a update profile command.");
        return true;
    }

    @Override
    public void execute(String commandLine) {

    }
}
