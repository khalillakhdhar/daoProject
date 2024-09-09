package com.elitech.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Agent;



public interface AgentRepository extends JpaRepository<Agent, Long> {
Agent findByEmail(String email);
List<Agent> findByNomOrPrenom(String nom,String prenom);
List<Agent> findByAgeGreaterThan(int age);
List<Agent> findByAdresseContaining(String adresse);

}
