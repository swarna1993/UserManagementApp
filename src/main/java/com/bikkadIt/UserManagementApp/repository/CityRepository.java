package com.bikkadIt.UserManagementApp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.UserManagementApp.entities.CityMasterEntity;
@Repository
public interface CityRepository extends JpaRepository<CityMasterEntity, Serializable>{

}
