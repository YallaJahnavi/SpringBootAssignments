package com.example.bmsbookmyshow.dtos;

public class LoginResponseDto {

    private boolean isLoggedIn;
    private String message;
    private String userName;  // Optional: can include user's name if needed
    private String email;

    // Constructors
    public LoginResponseDto() {}

    public LoginResponseDto(boolean isLoggedIn, String message) {
        this.isLoggedIn = isLoggedIn;
        this.message = message;
    }

    public LoginResponseDto(boolean isLoggedIn, String message, String userName, String email) {
        this.isLoggedIn = isLoggedIn;
        this.message = message;
        this.userName = userName;
        this.email = email;
    }

    // Getters and Setters
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
