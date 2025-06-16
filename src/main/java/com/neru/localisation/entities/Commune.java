package com.neru.localisation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Setter
@Getter
public class Commune {
    @Id
    @Column(name = "communeId", nullable = false, length = 254)
    private String communeId;


    @NotNull
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @NotNull
    @Column(name = "libelleFr", nullable = false, length = 254)
    private String libelleFr;

    @NotNull
    @Column(name = "libelleEn", nullable = false, length = 254)
    private String libelleEn;
}
