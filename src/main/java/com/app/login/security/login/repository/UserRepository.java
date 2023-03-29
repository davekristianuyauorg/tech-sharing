package com.app.login.security.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.login.security.login.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
