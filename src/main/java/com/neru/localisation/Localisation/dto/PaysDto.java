package com.neru.localisation.Localisation.dto;

import lombok.Value;


import java.io.Serializable;

@Value
public class PaysDto implements Serializable {
    private String paysId;

    private String continentId;

    private String abreviation;

    private String code;

    private String libelleFr;

    private String libelleEn;
}
