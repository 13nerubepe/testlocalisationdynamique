package com.neru.localisation.mapper;

import com.neru.localisation.dto.DepartementDto;
import com.neru.localisation.entities.Departement;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface DepartementMapper {
    Departement toEntity(DepartementDto departementDto);

    DepartementDto toDto(Departement departement);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Departement partialUpdate(DepartementDto departementDto, @MappingTarget Departement departement);
}