package com.neru.localisation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;


@Entity
@Setter
@Getter
public class Arrondissement {
    @Id
    @Column(name = "arrondissementId", nullable = false, length = 254)
    private String arrondissementId;


    @NotNull
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @NotNull
    @Column(name = "libelleFr", nullable = false, length = 254)
    private String libelleFr;

    @NotNull
    @Column(name = "libelleEn", nullable = false, length = 254)
    private String libelleEn;

    @NotNull
    @Column(name = "chefLieu", nullable = false, length = 254)
    private String chefLieu;
}
