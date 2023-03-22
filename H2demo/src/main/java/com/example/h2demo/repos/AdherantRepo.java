package com.example.h2demo.repos;

import com.example.h2demo.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdherantRepo extends JpaRepository<Adherent, Long> {
}
