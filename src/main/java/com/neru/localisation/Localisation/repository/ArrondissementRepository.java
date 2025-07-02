package com.neru.localisation.Localisation.repository;

import com.neru.localisation.Localisation.entities.Arrondissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArrondissementRepository extends JpaRepository<Arrondissement, String>, JpaSpecificationExecutor<Arrondissement> {
}