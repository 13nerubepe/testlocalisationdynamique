package com.neru.localisation.mapper;

import com.neru.localisation.dto.ContinentDto;
import com.neru.localisation.entities.Continent;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ContinentMapper {
    Continent toEntity(ContinentDto continentDto);

    ContinentDto toDto(Continent continent);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Continent partialUpdate(ContinentDto continentDto, @MappingTarget Continent continent);
}