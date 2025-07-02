package com.neru.localisation.Localisation.repository;

import com.neru.localisation.Localisation.entities.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VillageRepository extends JpaRepository<Village, String>, JpaSpecificationExecutor<Village> {
}