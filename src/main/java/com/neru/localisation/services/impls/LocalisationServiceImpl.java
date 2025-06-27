package com.neru.localisation.services.impls;

import com.neru.localisation.dto.*;
import com.neru.localisation.entities.*;
import com.neru.localisation.mapper.LocalisationMapper;
import com.neru.localisation.repository.*;
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
    private final ArrondissementRepository arrondissementRepository;
    private final CommuneRepository communeRepository;
    private final GroupementRepository groupementRepository;
    private final VillageRepository villageRepository;
    private final LocalisationMapper localisationMapper;

    public LocalisationServiceImpl(ContinentRepository continentRepository, PaysRepository paysRepository, RegionRepository regionRepository, DepartementRepository departementRepository, ArrondissementRepository arrondissementRepository, CommuneRepository communeRepository, GroupementRepository groupementRepository, VillageRepository villageRepository, LocalisationMapper localisationMapper) {
        this.continentRepository = continentRepository;
        this.paysRepository = paysRepository;
        this.regionRepository = regionRepository;
        this.departementRepository = departementRepository;
        this.arrondissementRepository = arrondissementRepository;
        this.communeRepository = communeRepository;
        this.groupementRepository = groupementRepository;
        this.villageRepository = villageRepository;
        this.localisationMapper = localisationMapper;
    }


    /**   recherche hierachique et dynamique*/

    @Override
    public List<PaysDto> searchPaysByContinentId(LocalisationFilterDto filter) {
        Specification<Pays> spPays = LocalisationBuilder.buildPaysSpec(filter);
        return paysRepository.findAll(spPays)
                .stream()
                .map(localisationMapper::toDto)
                .collect(Collectors.toList());

    }

    @Override
    public List<RegionDto> searchRegionByPaysId(LocalisationFilterDto filter) {
        Specification<Region> spregion = LocalisationBuilder.buildRegionSpec(filter);
        return regionRepository.findAll(spregion)
                .stream()
                .map(localisationMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<DepartementDto> searchDepartementsByRegionId(LocalisationFilterDto filter) {
        Specification<Departement> spdepartement = LocalisationBuilder.buildDepartementSpec(filter);
        return departementRepository.findAll(spdepartement)
                .stream()
                .map(departement -> localisationMapper.toDto(departement))
                .collect(Collectors.toList());
    }

    @Override
    public List<ArrondissementDto> searchRegionByDepartementId(LocalisationFilterDto filter) {
        Specification<Arrondissement> sparrondissement = LocalisationBuilder.buildArrondissementSpec(filter);
        return arrondissementRepository.findAll(sparrondissement)
                .stream()
                .map(arrondissement -> localisationMapper.toDto(arrondissement))
                .toList();
    }

    @Override
    public List<CommuneDto> searchCommunesByArrondissementId(LocalisationFilterDto filter) {
        Specification<Commune> spcommune = LocalisationBuilder.buildCommuneSpec(filter);
        return communeRepository.findAll(spcommune)
                .stream()
                .map(commune -> localisationMapper.toDto(commune))
                .toList();
    }

    @Override
    public List<VillageDto> searchVillageByCommuneId(LocalisationFilterDto filter) {
        Specification<Village> spvillage = LocalisationBuilder.buildVillageSpec(filter);
        return villageRepository.findAll(spvillage)
                .stream()
                .map(departement -> localisationMapper.toDto(departement))
                .collect(Collectors.toList());
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
