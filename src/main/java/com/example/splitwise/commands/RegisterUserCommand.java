package com.example.splitwise.commands;

import com.example.splitwise.controllers.UserController;
import com.example.splitwise.dtos.RegisterUserRequestDto;
import com.example.splitwise.dtos.RegisterUserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RegisterUserCommand implements Command {

    private final UserController userController;
    @Autowired
    public RegisterUserCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean parse(String commandLine) {
        List<String> commandTokens = Arrays.asList(commandLine.split(" "));
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
        List<String> commandTokens = Arrays.asList(commandLine.split(" "));

        RegisterUserRequestDto registerUserRequestDto = new RegisterUserRequestDto();
        registerUserRequestDto.setName(commandTokens.get(1));
        registerUserRequestDto.setPhoneNumber(commandTokens.get(2));
        registerUserRequestDto.setPassword(commandTokens.get(3));

        RegisterUserResponseDto registerUserResponseDto = userController.registerUser(registerUserRequestDto);
        System.out.println(registerUserResponseDto.getUser());
    }
}
