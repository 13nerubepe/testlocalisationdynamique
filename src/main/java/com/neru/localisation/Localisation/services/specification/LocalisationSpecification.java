package com.neru.localisation.Localisation.services.specification;

import com.neru.localisation.Localisation.entities.*;
import org.springframework.data.jpa.domain.Specification;

public class LocalisationSpecification {
    public static <T> Specification<T> hasCode(String code) {
        return (root, query, cb) -> cb.equal(root.get("code"), code);
    }

    public static <T> Specification<T> hasLikeName(String likeName) {
        return (root, query, cb) -> cb.or(
                cb.like(cb.lower(root.get("libelleFr")), "%" + likeName.toLowerCase() + "%"),
                cb.like(cb.lower(root.get("libelleEn")), "%" + likeName.toLowerCase() + "%")
        );
    }

    public static Specification<Pays> byContinentId(String continentId) {
        return (root, query, cb) -> cb.equal(root.get("continent").get("continentId"), continentId);
    }

    public static Specification<Region> byPaysId(String paysId) {
        return (root, query, cb) -> cb.equal(root.get("pays").get("paysId"), paysId);
    }

    public static Specification<Departement> byRegionId(String regionId) {
        return (root, query, cb) -> cb.equal(root.get("region").get("regionId"), regionId);
    }

    public static Specification<Arrondissement> byDepartementId(String departementId) {
        return (root, query, cb) -> cb.equal(root.get("departement").get("departementId"), departementId);
    }
    /**  enfant de arrondissement c'est commune et groupement*/
    public static Specification<Commune> comByArrondissementId(String arrondissementId) {
        return (root, query, cb) -> cb.equal(root.get("arrondissement").get("arrondissementId"), arrondissementId);
    }
    public static Specification<Groupement> grpByArrondissementId(String arrondissementId) {
        return (root, query, cb) -> cb.equal(root.get("arrondissement").get("arrondissementId"), arrondissementId);
    }
    public static Specification<Village> byGroupementId(String groupementId) {
        return (root, query, cb) -> cb.equal(root.get("groupement").get("groupementId"), groupementId);
    }

}
