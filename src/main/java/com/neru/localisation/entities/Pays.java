package com.neru.localisation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;


@Getter
@Setter
@Entity
public class Pays {
    @Id
    @Column(name = "paysId", nullable = false, length = 254)
    private String paysId;

    @NotNull
    @Column(name = "continentId", nullable = false, length = 254)
    private String continentId;

    @Column(name = "abreviation", length = 50)
    private String abreviation;

    @Column(name = "code", length = 50)
    private String code;

    @NotNull
    @Column(name = "libelleFr", nullable = false, length = 254)
    private String libelleFr;

    @NotNull
    @Column(name = "libelleEn", nullable = false, length = 254)
    private String libelleEn;

    @ManyToOne()
    private Continent continent;

    @OneToMany(mappedBy = "pays")
    private List<Region> regionList;
}
