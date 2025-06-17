package com.neru.localisation.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocalisationFilterDto {
    private String continentId;
    private String paysId;
    private String regionId;
    private String departementId;
    private String arrondissementId;
    private String communeId;
    private String villageId;


    // Recherche par code
    private String code;

    // Recherche textuelle (libelleFr ou libelleEn)
    private String likeName;
}
