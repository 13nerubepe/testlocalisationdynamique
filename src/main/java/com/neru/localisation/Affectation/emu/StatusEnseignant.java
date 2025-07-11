package com.neru.localisation.Affectation.emu;

public enum StatusEnseignant {
    ACTIF("Actif"),
    INACTIF("Inactif"),
    RETRAITE("Retraite"),
    DECEDE("Décédé"),
    DISPONIBLE("Disponible"),
    INDISPONIBLE("Indisponible");

    private final String status;

    StatusEnseignant(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
