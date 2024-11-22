package com.service;


public interface UserService {

    User save(User user);

    public User findByUsername(String username);
}

