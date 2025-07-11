package com.neru.localisation.OrganigrammeEtablissement.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class StructureMinister {
    @Id
    private String posteId;
    private String poste;
    private String titre;
    private String code;
    private Integer niveau;

    @ManyToOne
    private Service departement;
}
