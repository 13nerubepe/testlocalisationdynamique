package com.neru.localisation.controlleur;

import com.neru.localisation.dto.ContinentDto;
import com.neru.localisation.services.LocalisationService;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Tag(name = "Localisation", description = "API pour gérer la localisation")
public class LocalisationControlleur {
    private final LocalisationService localisationService;

    public LocalisationControlleur(LocalisationService localisationService) {
        this.localisationService = localisationService;
    }

    @GetMapping("continent/{continentId}")
    public ResponseEntity<ContinentDto> getContinentById(@PathVariable String continentId){
//        ContinentDto contId = localisationService.findContinentById(continentId);
//        if (contId == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(contId);
        return null;
    }

    @GetMapping("listcontinent")
    public ResponseEntity<List<ContinentDto>> getListContinents(){

        return null;
    }

//    @GetMapping("pays/{paysId}")
//    public ResponseEntity<BasePaysDto> getPaysById(@PathVariable("paysId") String paysId){
//        BasePaysDto paysD = baseLocalisationService.findPaysById(paysId);
//        return ResponseEntity.ok(paysD);
//    }
//
//    @GetMapping("listpays")
//    public ResponseEntity<List<BasePaysDto>> getListPays(){
//        List<BasePaysDto> pays = baseLocalisationService.findAllPays();
//        return ResponseEntity.ok(pays);
//    }

//    @GetMapping("/pays")
//    public  ResponseEntity<Page<BasePaysDto>> getPagePays(@ParameterObject @ModelAttribute BaseLocalisationFilterDto filter, @ParameterObject Pageable pageable) {
//        Page<BasePaysDto> pageResult = baseLocalisationService.searchPaginatedPays(filter, pageable);
//        return ResponseEntity.ok(pageResult);
//    }
}
