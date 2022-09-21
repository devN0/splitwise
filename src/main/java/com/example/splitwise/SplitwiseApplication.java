package com.example.splitwise;

import com.example.splitwise.commands.RegisterUserCommand;
import com.example.splitwise.commands.UpdateProfileCommand;
import com.example.splitwise.commands.registry.CommandRegistry;
import com.example.splitwise.commands.registry.CommandRegistryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CommandRegistry commandRegistry = new CommandRegistryImpl();
        commandRegistry.registerCommand(new RegisterUserCommand());
        commandRegistry.registerCommand(new UpdateProfileCommand());

        String input = "u1 UpdateProfile noop";

        commandRegistry.executeCommand(input);
    }
}
