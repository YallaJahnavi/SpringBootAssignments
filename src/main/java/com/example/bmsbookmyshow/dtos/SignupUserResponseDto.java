package com.example.bmsbookmyshow.dtos;

public class SignupUserResponseDto {

    private int userId;
    private String userName;
    private String email;

    public SignupUserResponseDto(int userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
