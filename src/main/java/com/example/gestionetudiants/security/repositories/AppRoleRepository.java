package com.example.gestionetudiants.security.repositories;


import com.example.gestionetudiants.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
    AppRole findByRoleName(String roleName);
}
