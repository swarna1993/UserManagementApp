package com.bikkadIt.UserManagementApp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.UserManagementApp.entities.UserAccountEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Serializable>{

}
