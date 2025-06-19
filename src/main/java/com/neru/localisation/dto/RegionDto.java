package com.neru.localisation.dto;

import lombok.Value;


import java.io.Serializable;

@Value
public class RegionDto implements Serializable {
    private String regionId;

    private String code;

    private String libelleFr;

    private String libelleEn;

    private String chefLieu;
}
