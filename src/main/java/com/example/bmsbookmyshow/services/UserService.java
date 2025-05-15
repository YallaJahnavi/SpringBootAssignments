package com.example.bmsbookmyshow.services;

import com.example.bmsbookmyshow.entity.UserEntity;
import com.example.bmsbookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean registerUser(UserEntity user) {
        if (userRepository.findByEmail(user.getEmail()) != null || 
            userRepository.findByuserName(user.getUserName()) != null) {
            return false; // Duplicate email or username
        }
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        userRepository.save(user);
        return true;
    }
    
    public UserEntity validateUser(String email, String password) {
        UserEntity user = userRepository.findByEmail(email);
        if (user != null) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            if (encoder.matches(password, user.getPassword())) {
                return user; // Password matched
            }
        }
        return null; // User not found or password incorrect
    }

}
