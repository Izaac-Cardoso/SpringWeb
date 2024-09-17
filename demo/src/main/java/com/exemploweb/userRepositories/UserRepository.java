package com.exemploweb.userRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
