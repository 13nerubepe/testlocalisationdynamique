package com.neru.localisation.repository;

import com.neru.localisation.entities.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaysRepository extends JpaRepository<Pays, String>, JpaSpecificationExecutor<Pays> {
}