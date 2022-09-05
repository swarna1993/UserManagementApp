package com.bikkadIt.UserManagementApp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.UserManagementApp.entities.StateMasterEntity;

public interface StateRepository extends JpaRepository<StateMasterEntity, Serializable>{

}
