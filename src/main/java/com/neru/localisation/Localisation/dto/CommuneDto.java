package com.neru.localisation.Localisation.dto;


import lombok.Value;

import java.io.Serializable;

@Value
public class CommuneDto implements Serializable {
    private String communeId;
    private String code;

    private String libelleFr;
    private String libelleEn;
}
