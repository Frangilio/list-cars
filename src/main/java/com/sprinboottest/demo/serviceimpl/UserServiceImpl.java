package com.sprinboottest.demo.serviceimpl;

import com.sprinboottest.demo.models.User;
import com.sprinboottest.demo.repository.UserRepository;
import com.sprinboottest.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User save(User u) {
        return userRepository.save(u);
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User loadUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }
}
