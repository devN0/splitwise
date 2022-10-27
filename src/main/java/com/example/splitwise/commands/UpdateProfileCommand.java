package com.example.splitwise.commands;

import com.example.splitwise.controllers.UserController;
import com.example.splitwise.dtos.UpdateProfileRequestDto;
import com.example.splitwise.dtos.UpdateProfileResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class UpdateProfileCommand implements Command {

    UserController userController;
    @Autowired
    public UpdateProfileCommand(UserController userController) {
        this.userController = userController;
    }
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
        List<String> commandTokens = Arrays.asList(commandLine.split(" "));
        Long id = Long.parseLong(commandTokens.get(0));
        String password = commandTokens.get(2);

        UpdateProfileRequestDto updateProfileRequestDto = new UpdateProfileRequestDto();
        updateProfileRequestDto.setId(id);
        updateProfileRequestDto.setPassword(password);

        UpdateProfileResponseDto updateProfileResponseDto = userController.updateProfile(updateProfileRequestDto);
        System.out.println(updateProfileResponseDto.getUser());
    }
}
