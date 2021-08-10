package com.sprinboottest.demo.service;

import com.sprinboottest.demo.models.User;

public interface UserService {
    User save(User u);
    User get(Long id);
    User loadUserByEmail(String email);
}
