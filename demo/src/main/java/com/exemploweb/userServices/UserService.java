package com.exemploweb.userServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemploweb.userRepositories.UserRepository;

import com.exemploweb.entities.User;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * public User findById(Long id) {
     *      Optional obj = userRepository.findId(id);
     *      return obj.get();
     * }
     */

}
