package com.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.entity.User;

public interface UserRepo extends JpaRepository<User, String> {

}
