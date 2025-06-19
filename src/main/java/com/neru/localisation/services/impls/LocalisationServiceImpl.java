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
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        Specification<Pays> spPays = LocalisationBuilder.buildPaysSpec(filter);
        return paysRepository.findAll(spPays)
                .stream()
                .map(pays -> localisationMapper.toDto(pays))
                .collect(Collectors.toList());

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
    public GroupementDto findGroupementById(String groupementId) {
        return null;
    }

    @Override
    public List<GroupementDto> findAllGroupement() {
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

    /**
     * dans le projet de Probmis-Base
     * Gestion de pays
     */

//    @Override
//    public BasePaysDto findPaysById(String paysId) {
//        return localisationMapper.toDto(basePaysRepository.findById(paysId).orElseThrow(
//                () -> new EntityNotFoundException("continent non trouvé: " + paysId)
//        ));
//    }
//
//
//    @Override
//    public List<BasePaysDto> findAllPays() {
//        return basePaysRepository.findAll().stream().map(localisationMapper::toDto).collect(Collectors.toList());
//    }
//
//    @Override
//    public Page<BasePaysDto> searchPaginatedPays(BaseLocalisationFilterDto filter, Pageable pageable){
//        Specification<BasePays> spec = BaseLocalisationBuilder.buildPaysSpec(filter);
//        return basePaysRepository.findAll(spec, pageable).map(localisationMapper ::toDto);
//    }

//    @Override
//    public Page<BaseVillageDto> searchPaginatedVillage(BaseLocalisationFilterDto filter, Pageable pageable){
//        Specification<BaseVillage> spec = BaseLocalisationBuilder.buildVillageSpec(filter);
//        return baseVillageRepository.findAll(spec, pageable).map(localisationMapper ::toDto);
//    }
}
