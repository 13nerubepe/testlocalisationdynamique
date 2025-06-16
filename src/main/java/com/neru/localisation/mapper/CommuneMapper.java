package com.neru.localisation.mapper;

import com.neru.localisation.dto.CommuneDto;
import com.neru.localisation.entities.Commune;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CommuneMapper {
    Commune toEntity(CommuneDto communeDto);

    CommuneDto toDto(Commune commune);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Commune partialUpdate(CommuneDto communeDto, @MappingTarget Commune commune);
}