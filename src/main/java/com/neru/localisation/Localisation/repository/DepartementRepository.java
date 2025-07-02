package com.neru.localisation.Localisation.repository;

import com.neru.localisation.Localisation.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartementRepository extends JpaRepository<Departement, String>, JpaSpecificationExecutor<Departement> {
}