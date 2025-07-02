package com.neru.localisation.Localisation.repository;

import com.neru.localisation.Localisation.entities.Commune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommuneRepository extends JpaRepository<Commune, String>, JpaSpecificationExecutor<Commune> {
}