package com.app.login.security.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.login.security.login.entities.ERole;
import com.app.login.security.login.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
