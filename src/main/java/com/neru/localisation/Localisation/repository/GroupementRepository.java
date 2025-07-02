package com.neru.localisation.Localisation.repository;

import com.neru.localisation.Localisation.entities.Groupement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GroupementRepository extends JpaRepository<Groupement, String>, JpaSpecificationExecutor<Groupement> {
}