package com.neru.localisation.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Groupement {

    @Id
    @Size(max = 254)
    @Column(name = "groupementId", nullable = false, length = 254)
    private String groupementId;

    @Size(max = 50)
    @NotNull
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @Size(max = 254)
    @NotNull
    @Column(name = "libelleFr", nullable = false, length = 254)
    private String libelleFr;

    @Size(max = 254)
    @NotNull
    @Column(name = "libelleEn", nullable = false, length = 254)
    private String libelleEn;

    /** Enfant de la classe*/
    @OneToMany(mappedBy = "groupement")
    private List<Village> villageList;

    /** parent de la classe*/
    @ManyToOne
    private Arrondissement arrondissement;
}
