package com.neru.localisation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
@Entity
public class Continent {
    @Id
    @Column(name = "continentId", nullable = false, length = 254)
    private String continentId;

    @NotNull
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @NotNull
    @Column(name = "libelleFr", nullable = false, length = 254)
    private String libelleFr;

    @NotNull
    @Column(name = "libelleEn", nullable = false, length = 254)
    private String libelleEn;


    @OneToMany(mappedBy = "continent")
    private List<Pays> paysList;
}
