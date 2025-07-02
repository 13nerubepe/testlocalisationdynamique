package com.neru.localisation.OrganigrammeCollege.entities;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Departement {
    @Id
    private String departementId;
    private String nom;

//    quand on veux recupere la liste des enfants a partir du id parent
//    @OneToMany(mappedBy = "departement")
//    private List<Poste> posteList;
}
