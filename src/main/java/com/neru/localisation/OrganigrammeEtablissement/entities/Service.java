package com.neru.localisation.OrganigrammeEtablissement.entities;

import jakarta.persistence.Id;

public class Service {
    @Id
    private String departementId;
    private String nom;

//    quand on veux recupere la liste des enfants a partir du id parent
//    @OneToMany(mappedBy = "departement")
//    private List<Poste> posteList;
}
