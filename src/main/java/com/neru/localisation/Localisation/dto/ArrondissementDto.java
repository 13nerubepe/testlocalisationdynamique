package com.neru.localisation.Localisation.dto;


import lombok.Value;

import java.io.Serializable;

@Value
public class ArrondissementDto implements Serializable {
    private String arrondissementId;

    private String code;
    private String libelleFr;

    private String libelleEn;

    private String chefLieu;
}
