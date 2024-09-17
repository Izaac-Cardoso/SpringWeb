package com.exemploweb.testConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

import com.exemploweb.entities.*;
import com.exemploweb.userRepositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "153624");
        User u2 = new User(null, "Dimmy Jhones", "jhones@gmail.com", "988775511", "123456");
        
        userRepo.saveAll(Arrays.asList(u1,u2));

        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
