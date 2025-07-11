package com.neru.localisation.Localisation.services.specification;

import com.neru.localisation.Localisation.entities.*;
import com.neru.localisation.Localisation.dto.LocalisationFilterDto;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

public class LocalisationBuilder {

    public static Specification<Pays> buildPaysSpec(LocalisationFilterDto filter) {
        Specification<Pays> spec = (root, query, cb) -> cb.conjunction();

        if (StringUtils.hasText(filter.getContinentId())) {
            spec = spec.and(LocalisationSpecification.byContinentId(filter.getContinentId()));
        }

        if (StringUtils.hasText(filter.getCode())) {
            spec = spec.and(LocalisationSpecification.hasCode(filter.getCode()));
        }

        if (StringUtils.hasText(filter.getLikeName())) {
            spec = spec.and(LocalisationSpecification.hasLikeName(filter.getLikeName()));
        }

        return spec;
    }

    public static Specification<Region> buildRegionSpec(LocalisationFilterDto filter) {
//        Specification<Region> spec = Specification.where(null);
        Specification<Region> spec = (root, query, cb) -> cb.conjunction();

        if (StringUtils.hasText(filter.getPaysId())) {
            spec = spec.and(LocalisationSpecification.byPaysId(filter.getPaysId()));
        }

        if (StringUtils.hasText(filter.getLikeName())) {
            spec = spec.and(LocalisationSpecification.hasLikeName(filter.getLikeName()));
        }

        return spec;
    }

    public static Specification<Departement> buildDepartementSpec(LocalisationFilterDto filter) {
        Specification<Departement> spec = (root, query, cb) -> cb.conjunction();

        if (StringUtils.hasText(filter.getRegionId())) {
            spec = spec.and(LocalisationSpecification.byRegionId(filter.getRegionId()));
        }

        if (StringUtils.hasText(filter.getLikeName())) {
            spec = spec.and(LocalisationSpecification.hasLikeName(filter.getLikeName()));
        }

        return spec;
    }
    public static Specification<Arrondissement> buildArrondissementSpec(LocalisationFilterDto filter) {
        Specification<Arrondissement> spec = (root, query, cb) -> cb.conjunction();

        if (StringUtils.hasText(filter.getDepartementId())) {
            spec = spec.and(LocalisationSpecification.byDepartementId(filter.getDepartementId()));
        }

        if (StringUtils.hasText(filter.getLikeName())) {
            spec = spec.and(LocalisationSpecification.hasLikeName(filter.getLikeName()));
        }

        return spec;
    }

    public static Specification<Commune> buildCommuneSpec(LocalisationFilterDto filter) {
        Specification<Commune> spec = (root, query, cb) -> cb.conjunction();

        if (StringUtils.hasText(filter.getArrondissementId())) {
            spec = spec.and(LocalisationSpecification.comByArrondissementId(filter.getArrondissementId()));
        }

        if (StringUtils.hasText(filter.getLikeName())) {
            spec = spec.and(LocalisationSpecification.hasLikeName(filter.getLikeName()));
        }

        return spec;
    }

    public static Specification<Groupement> buildGroupementSpec(LocalisationFilterDto filter) {
        Specification<Groupement> spec = (root, query, cb) -> cb.conjunction();

        if (StringUtils.hasText(filter.getArrondissementId())) {
            spec = spec.and(LocalisationSpecification.grpByArrondissementId(filter.getArrondissementId()));
        }

        if (StringUtils.hasText(filter.getLikeName())) {
            spec = spec.and(LocalisationSpecification.hasLikeName(filter.getLikeName()));
        }

        return spec;
    }

    public static Specification<Village> buildVillageSpec(LocalisationFilterDto filter) {
        Specification<Village> spec = (root, query, cb) -> cb.conjunction();

        if (StringUtils.hasText(filter.getGroupementId())) {
            spec = spec.and(LocalisationSpecification.byGroupementId(filter.getArrondissementId()));
        }

        if (StringUtils.hasText(filter.getLikeName())) {
            spec = spec.and(LocalisationSpecification.hasLikeName(filter.getLikeName()));
        }

        return spec;
    }
}
