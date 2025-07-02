package com.neru.localisation.OrganigrammeCollege.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.Instant;

public class Acteur {
    @Id
    private String acteurId;
    private String nom;
    private String prenom;
    private String sexe;
    private String email;
    private String number;
    private Boolean actif = true;
    private Instant dateEmbauche;

    @ManyToOne
    private Poste poste;

    @ManyToOne
    private TypePersonnel typePersonnel;
    @ManyToOne
    private SuperieurHierarchique superieurHierarchique;
}
