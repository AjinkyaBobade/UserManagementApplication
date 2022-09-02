package com.BikakadIT.UserManagementApplication.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikakadIT.UserManagementApplication.entities.UserAccountEntity;

@Repository
public interface UserAccoutRepository extends JpaRepository<UserAccountEntity, Serializable>{

}
