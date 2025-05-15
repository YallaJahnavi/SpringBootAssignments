package com.example.bmsbookmyshow.repositories;

import com.example.bmsbookmyshow.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByuserName(String userName);
    UserEntity findByEmail(String email);
}

