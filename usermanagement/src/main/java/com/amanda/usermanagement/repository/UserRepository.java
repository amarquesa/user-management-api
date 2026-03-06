package com.amanda.usermanagement.repository;

import com.amanda.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}