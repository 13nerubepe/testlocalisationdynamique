package com.neru.localisation.Localisation.dto;


import lombok.Value;

import java.io.Serializable;

@Value
public class DepartementDto implements Serializable {
    private String departementId;

    private String code;

    private String libelleFr;

    private String libelleEn;

    private String chefLieu;
}
