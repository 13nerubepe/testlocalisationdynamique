package com.neru.localisation.repository;

import com.neru.localisation.entities.Groupement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GroupementRepository extends JpaRepository<Groupement, String>, JpaSpecificationExecutor<Groupement> {
}