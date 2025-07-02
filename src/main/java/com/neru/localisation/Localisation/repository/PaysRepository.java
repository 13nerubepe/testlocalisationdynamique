package com.neru.localisation.Localisation.repository;

import com.neru.localisation.Localisation.entities.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaysRepository extends JpaRepository<Pays, String>, JpaSpecificationExecutor<Pays> {
}