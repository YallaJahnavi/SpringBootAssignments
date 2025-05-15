package com.example.bmsbookmyshow.controllers;

import com.example.bmsbookmyshow.entity.UserEntity;
import com.example.bmsbookmyshow.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            HttpSession session,
                            Model model) {

        UserEntity user = userService.validateUser(email, password);

        if (user != null) {
            session.setAttribute("loggedInUser", user);
            model.addAttribute("msg", "Login successful");
            return "redirect:/index";
        } else {
            model.addAttribute("error", "Invalid email or password.");
            return "login";
        }
    }

	/*
	 * @GetMapping("/logout") public String logout(HttpSession session) {
	 * session.invalidate(); return "redirect:/login"; }
	 */
    
    @GetMapping("/index")
    public String showIndexPage()
    {
        return "index"; // points to index.jsp
    }

}
