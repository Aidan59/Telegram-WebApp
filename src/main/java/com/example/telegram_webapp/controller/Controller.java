package com.example.telegram_webapp.controller;

import com.example.telegram_webapp.dto.AuthDTO;
import com.example.telegram_webapp.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(/*@RequestBody AuthDTO authDTO*/) {
        return "App deployed";
    }
}
