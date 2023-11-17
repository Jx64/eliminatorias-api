package com.eliminatorias.repositories;

import com.eliminatorias.entities.ERole;
import com.eliminatorias.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
