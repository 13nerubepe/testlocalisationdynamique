package com.neru.localisation.repository;

import com.neru.localisation.entities.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContinentRepository extends JpaRepository<Continent, String>, JpaSpecificationExecutor<Continent> {
}