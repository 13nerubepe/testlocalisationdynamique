package com.neru.localisation.services.impls;

import com.neru.localisation.dto.*;
import com.neru.localisation.entities.Pays;
import com.neru.localisation.mapper.LocalisationMapper;
import com.neru.localisation.repository.ContinentRepository;
import com.neru.localisation.repository.DepartementRepository;
import com.neru.localisation.repository.PaysRepository;
import com.neru.localisation.repository.RegionRepository;
import com.neru.localisation.services.LocalisationService;
import com.neru.localisation.services.specification.LocalisationBuilder;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class LocalisationServiceImpl implements LocalisationService {

    private final ContinentRepository continentRepository;
    private final PaysRepository paysRepository;
    private final RegionRepository regionRepository;
    private final DepartementRepository departementRepository;
    private final LocalisationMapper localisationMapper;

    public LocalisationServiceImpl(ContinentRepository continentRepository, PaysRepository paysRepository, RegionRepository regionRepository, DepartementRepository departementRepository, LocalisationMapper localisationMapper) {
        this.continentRepository = continentRepository;
        this.paysRepository = paysRepository;
        this.regionRepository = regionRepository;
        this.departementRepository = departementRepository;
        this.localisationMapper = localisationMapper;
    }


    /**   recherche hierachique et dynamique*/

    @Override
    public List<PaysDto> searchPaysByContinentId(LocalisationFilterDto filter) {
//        Specification<Pays> spPays = LocalisationBuilder.buildPaysSpec(filter);
//        return paysRepository.findAll(spPays)
//                .stream()
//                .map(LocalisationMapper::toDto)
//                .collect(Collectors.toList());
        return null;
    }

    @Override
    public List<RegionDto> searchRegionByPaysId(LocalisationFilterDto filter) {
        return null;
    }

    @Override
    public List<DepartementDto> searchDepartementsByRegionId(LocalisationFilterDto filter) {
        return null;
    }

    @Override
    public List<ArrondissementDto> searchRegionByDepartementId(LocalisationFilterDto filter) {
        return null;
    }

    @Override
    public List<CommuneDto> searchCommunesByArrondissementId(LocalisationFilterDto filter) {
        return null;
    }

    @Override
    public List<VillageDto> searchVillageByCommuneId(LocalisationFilterDto filter) {
        return null;
    }

    @Override
    public ContinentDto findContinentById(String continentId) {
        return null;
    }

    @Override
    public List<ContinentDto> findAllContinents() {
        return null;
    }

    @Override
    public PaysDto findPaysById(String paysId) {
        return null;
    }

    @Override
    public List<PaysDto> findAllPays() {
        return null;
    }

    @Override
    public RegionDto findRegionById(String regionId) {
        return null;
    }

    @Override
    public List<RegionDto> findAllRegion() {
        return null;
    }

    @Override
    public DepartementDto findDepartementById(String departementId) {
        return null;
    }

    @Override
    public List<DepartementDto> findAllDepartement() {
        return null;
    }

    @Override
    public PaysDto findArrondissementById(String arrondissement) {
        return null;
    }

    @Override
    public List<PaysDto> findAllArrondissement() {
        return null;
    }

    @Override
    public CommuneDto findCommuneById(String CommuneId) {
        return null;
    }

    @Override
    public List<CommuneDto> findAllCommune() {
        return null;
    }

    @Override
    public VillageDto findVillageById(String villageId) {
        return null;
    }

    @Override
    public List<VillageDto> findAllVillage() {
        return null;
    }
}
