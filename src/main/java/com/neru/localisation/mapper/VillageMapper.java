package com.neru.localisation.mapper;

import com.neru.localisation.dto.VillageDto;
import com.neru.localisation.entities.Village;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface VillageMapper {
    Village toEntity(VillageDto villageDto);

    VillageDto toDto(Village village);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Village partialUpdate(VillageDto villageDto, @MappingTarget Village village);
}