package com.gl.Clgfstmgmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.Clgfstmgmt.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(String name);
}
