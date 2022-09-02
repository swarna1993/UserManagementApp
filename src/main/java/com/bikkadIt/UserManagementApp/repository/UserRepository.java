package com.bikkadIt.UserManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.UserManagementApp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}




//@Repository annotation is optional
