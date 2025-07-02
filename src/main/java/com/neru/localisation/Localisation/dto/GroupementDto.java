package com.neru.localisation.Localisation.dto;

import com.neru.localisation.Localisation.entities.Groupement;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Groupement}
 */
@Value
public class GroupementDto implements Serializable {
    @Size(max = 254)
    String groupementId;
    @NotNull
    @Size(max = 50)
    String code;
    @NotNull
    @Size(max = 254)
    String libelleFr;
    @NotNull
    @Size(max = 254)
    String libelleEn;
}