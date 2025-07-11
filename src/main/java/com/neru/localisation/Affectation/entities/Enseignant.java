package com.neru.localisation.Affectation.entities;

import com.neru.localisation.Affectation.emu.SituationEnseignant;
import com.neru.localisation.Affectation.emu.StatusEnseignant;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class Enseignant {
    private String nom;
    private String prenom;
    private String matricule;
    private String dateNaissance;
    private String lieuNaissance;
    private String sexe;
    private String nationalite;
    private String situationFamiliale;
    private String adresse;
    private String telephone;
    private String email;
    private LocalDate dateRecrutement;

    @Enumerated(EnumType.STRING)
    private StatusEnseignant statusEnseignant;
    @Enumerated(EnumType.STRING)
    private SituationEnseignant situationEnseignant;
}
