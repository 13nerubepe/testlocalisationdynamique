package com.neru.localisation.repository;

import com.neru.localisation.entities.Commune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommuneRepository extends JpaRepository<Commune, String>, JpaSpecificationExecutor<Commune> {
}