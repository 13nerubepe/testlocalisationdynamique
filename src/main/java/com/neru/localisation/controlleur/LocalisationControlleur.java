package com.neru.localisation.controlleur;

import com.neru.localisation.dto.ContinentDto;
import com.neru.localisation.services.LocalisationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestControlleur
@Tag(name = "Localisation", description = "API pour gérer la localisation")
public class LocalisationControlleur {
    private final LocalisationService localisationService;

    public LocalisationControlleur(LocalisationService localisationService) {
        this.localisationService = localisationService;
    }

    @GetMapping("continent/{continentId}")
    public ResponseEntity<ContinentDto> getContinentById(@PathVariable String continentId){
//        BaseContinentDto contId = baseLocalisationService.findContinentById(continentId);
//        if (contId == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(contId);
//    }

    @GetMapping("listcontinent")
    public ResponseEntity<List<ContinentDto>> getListContinents(){

    }
}
