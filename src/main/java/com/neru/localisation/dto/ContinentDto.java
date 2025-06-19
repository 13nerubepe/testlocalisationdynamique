package com.neru.localisation.dto;


import lombok.Value;

import java.io.Serializable;

@Value
public class ContinentDto implements Serializable {
    private String continentId;
    private String code;
    private String libelleFr;

    private String libelleEn;
}
