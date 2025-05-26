package com.example.telegram_webapp.service;

import com.example.telegram_webapp.entity.User;
import com.example.telegram_webapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
