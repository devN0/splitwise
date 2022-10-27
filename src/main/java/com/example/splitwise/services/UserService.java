package com.example.splitwise.services;

import com.example.splitwise.models.User;
import com.example.splitwise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User registerUser(String name, String phoneNumber, String password) {
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setPassword(password);

        return userRepository.save(user);
    }
}
