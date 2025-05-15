package com.example.bmsbookmyshow.controllers;

import com.example.bmsbookmyshow.entity.UserEntity;
import com.example.bmsbookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new UserEntity());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserEntity user, Model model) {
        boolean success = userService.registerUser(user);
        if (success) {
            model.addAttribute("msg", "Registration successful! Please login.");
            return "login";
        } else {
            model.addAttribute("error", "Email or Username already exists.");
            return "register";
        }
    }
}
