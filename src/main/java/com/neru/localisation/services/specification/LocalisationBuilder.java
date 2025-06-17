package com.neru.localisation.services.specification;

import com.neru.localisation.dto.LocalisationFilterDto;
import com.neru.localisation.entities.Arrondissement;
import com.neru.localisation.entities.Departement;
import com.neru.localisation.entities.Pays;
import com.neru.localisation.entities.Region;
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
}
