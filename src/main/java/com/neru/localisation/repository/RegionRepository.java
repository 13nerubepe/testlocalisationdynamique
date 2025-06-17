package com.neru.localisation.repository;

import com.neru.localisation.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegionRepository extends JpaRepository<Region, String>, JpaSpecificationExecutor<Region> {
}