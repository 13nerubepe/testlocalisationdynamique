package com.neru.localisation.OrganigrammeCollege.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Poste {
    @Id
    private String posteId;
    private String poste;
    private String titre;
    private String code;
    private Integer niveau;

    @ManyToOne
    private Departement departement;
}
