package com.neru.localisation.services;

import com.neru.localisation.dto.*;

import java.util.List;

public interface LocalisationService {
    List<PaysDto> searchPaysByContinentId(LocalisationFilterDto filter);
    List<RegionDto> searchRegionByPaysId(LocalisationFilterDto filter);
    List<DepartementDto> searchDepartementsByRegionId(LocalisationFilterDto filter);
    List<ArrondissementDto> searchRegionByDepartementId(LocalisationFilterDto filter);
    List<CommuneDto> searchCommunesByArrondissementId(LocalisationFilterDto filter);
    List<VillageDto> searchVillageByCommuneId(LocalisationFilterDto filter);


    /**
     * dans le projet de Probmis-Base
     * Gestion de continent
     */

   ContinentDto findContinentById(String continentId);
    List<ContinentDto> findAllContinents();


    /**
     * dans le projet de Probmis-Base
     * Gestion de pays
     */

    PaysDto findPaysById(String paysId);
    List<PaysDto> findAllPays();

    /**
     * dans le projet de Probmis-Base
     * Gestion de Region
     */

    RegionDto findRegionById(String regionId);
    List<RegionDto> findAllRegion();

    /**
     * dans le projet de Probmis-Base
     * Gestion de departement
     */

    DepartementDto findDepartementById(String departementId);
    List<DepartementDto> findAllDepartement();


    /**
     * dans le projet de Probmis-Base
     * Gestion de arrondissement
     */

    PaysDto findArrondissementById(String arrondissement);
    List<PaysDto> findAllArrondissement();

    /**
     * dans le projet de Probmis-Base
     * Gestion de commune
     */

    CommuneDto findCommuneById(String communeId);
    List<CommuneDto> findAllCommune();



    /**
     * dans le projet de Probmis-Base
     * Gestion de groupement
     */

    GroupementDto findGroupementById(String groupementId);
    List<GroupementDto> findAllGroupement();



    /**
     * dans le projet de Probmis-Base
     * Gestion de village
     */

    VillageDto findVillageById(String villageId);
    List<VillageDto> findAllVillage();
}
