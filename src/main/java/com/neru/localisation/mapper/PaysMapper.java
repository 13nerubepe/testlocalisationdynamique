package com.neru.localisation.mapper;

import com.neru.localisation.dto.PaysDto;
import com.neru.localisation.entities.Pays;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaysMapper {
    Pays toEntity(PaysDto paysDto);

    PaysDto toDto(Pays pays);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Pays partialUpdate(PaysDto paysDto, @MappingTarget Pays pays);
}