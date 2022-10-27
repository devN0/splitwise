package com.example.splitwise.controllers;

import com.example.splitwise.dtos.RegisterUserRequestDto;
import com.example.splitwise.dtos.RegisterUserResponseDto;
import com.example.splitwise.models.User;
import com.example.splitwise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public RegisterUserResponseDto registerUser(RegisterUserRequestDto registerUserRequestDto) {
        String name = registerUserRequestDto.getName();
        String phoneNumber = registerUserRequestDto.getPhoneNumber();
        String password = registerUserRequestDto.getPassword();

        User user = userService.registerUser(name, phoneNumber, password);

        RegisterUserResponseDto registerUserResponseDto = new RegisterUserResponseDto();
        registerUserResponseDto.setUser(user);
        return registerUserResponseDto;
    }
}
