package com.neru.localisation.Affectation.emu;

public enum SituationEnseignant {
    EN_SERVICE("En service"),
    DISPONIBLE("Disponible"),
    EN_REPOS("En repos"),
    EN_CONGES("En congés"),
    EN_MISSION("En mission"),
    RETRAITE("Retraité"),
    DECEDE("Décédé");

    private final String label;

    SituationEnseignant(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
