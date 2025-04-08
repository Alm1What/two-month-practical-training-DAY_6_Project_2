package org.example.day_6_practice_two.repository;

import org.example.day_6_practice_two.model.Role;
import org.example.day_6_practice_two.model.enumModel.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
