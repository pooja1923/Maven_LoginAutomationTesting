package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Endpoint for login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Returns the login page view
    }

    // Endpoint to process login form submission
    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password) {
        // Dummy validation
        if ("admin".equals(username) && "password123".equals(password)) {
            return "welcome"; // Redirect to the welcome page if login is successful
        }
        return "login"; // Return to the login page if authentication fails
    }
}
