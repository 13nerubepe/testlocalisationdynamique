package com.neru.localisation.Localisation.mapper;

import com.neru.localisation.Localisation.dto.*;
import com.neru.localisation.Localisation.entities.*;
import com.neru.localisation.dto.*;
import com.neru.localisation.entities.*;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocalisationMapper {


    /**   continent*/
    Continent toEntity(ContinentDto continentDto);

    ContinentDto toDto(Continent continent);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Continent partialUpdate(ContinentDto continentDto, @MappingTarget Continent continent);

    /**   PAYS*/
    Pays toEntity(PaysDto paysDto);

    PaysDto toDto(Pays pays);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Pays partialUpdate(PaysDto paysDto, @MappingTarget Pays pays);

    /**   REGION*/

    Region toEntity(RegionDto regionDto);

    RegionDto toDto(Region region);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Region partialUpdate(RegionDto regionDto, @MappingTarget Region region);


    /**   departement*/

    Departement toEntity(DepartementDto departementDto);

    DepartementDto toDto(Departement departement);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Departement partialUpdate(DepartementDto departementDto, @MappingTarget Departement departement);


    /**   Arrondissement*/
    Arrondissement toEntity(ArrondissementDto arrondissementDto);

    ArrondissementDto toDto(Arrondissement arrondissement);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Arrondissement partialUpdate(ArrondissementDto arrondissementDto, @MappingTarget Arrondissement arrondissement);

    /**   Commune*/

    Commune toEntity(CommuneDto communeDto);

    CommuneDto toDto(Commune commune);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Commune partialUpdate(CommuneDto communeDto, @MappingTarget Commune commune);


    /**   Groupement*/

    Groupement toEntity(GroupementDto groupementDto);

    GroupementDto toDto(Groupement groupement);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Groupement partialUpdate(GroupementDto groupementDto, @MappingTarget Groupement groupement);


    /**   village*/

    Village toEntity(VillageDto villageDto);

    VillageDto toDto(Village village);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Village partialUpdate(VillageDto villageDto, @MappingTarget Village village);


}