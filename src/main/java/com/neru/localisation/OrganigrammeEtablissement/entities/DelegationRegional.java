package com.neru.localisation.OrganigrammeEtablissement.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.Instant;

public class DelegationRegional {
    @Id
    private String personnelId;
    private String nom;
    private String prenom;
    private String sexe;
    private String email;
    private String number;
    private Boolean actif = true;
    private Instant dateEmbauche;
    private String Fonction;
    private String etablissementId;

    @ManyToOne
    private StructureMinister poste;

    @ManyToOne
    private TypePersonnel typePersonnel;
    @ManyToOne
    private SuperieurHierarchique superieurHierarchique;
}
