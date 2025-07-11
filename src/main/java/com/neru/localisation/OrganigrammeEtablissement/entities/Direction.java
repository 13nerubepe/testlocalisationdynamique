package com.neru.localisation.OrganigrammeEtablissement.entities;

import jakarta.persistence.Id;


public class Direction {
    @Id
    private String eleveId;
    private String nom;
    private String prenom;
    private String sexe;
    private String Classe;
    private String etablissementId;

}
