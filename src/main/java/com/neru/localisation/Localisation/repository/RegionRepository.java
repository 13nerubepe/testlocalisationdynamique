package com.neru.localisation.Localisation.repository;

import com.neru.localisation.Localisation.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegionRepository extends JpaRepository<Region, String>, JpaSpecificationExecutor<Region> {
}