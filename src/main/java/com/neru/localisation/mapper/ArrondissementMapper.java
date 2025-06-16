package com.neru.localisation.mapper;

import com.neru.localisation.dto.ArrondissementDto;
import com.neru.localisation.entities.Arrondissement;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ArrondissementMapper {
    Arrondissement toEntity(ArrondissementDto arrondissementDto);

    ArrondissementDto toDto(Arrondissement arrondissement);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Arrondissement partialUpdate(ArrondissementDto arrondissementDto, @MappingTarget Arrondissement arrondissement);
}