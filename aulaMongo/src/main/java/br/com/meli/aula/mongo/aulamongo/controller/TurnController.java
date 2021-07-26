package br.com.meli.aula.mongo.aulamongo.controller;

import br.com.meli.aula.mongo.aulamongo.model.Turn;
import br.com.meli.aula.mongo.aulamongo.model.TurnStatus;
import br.com.meli.aula.mongo.aulamongo.service.TurnService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TurnController {

    TurnService turnService;

    public TurnController(TurnService turnService) {
        this.turnService = turnService;
    }

    @GetMapping("turns/all")
    public List<Turn> getAllTurns(){
        return turnService.getAllTurns();
    }

    @GetMapping("turns/dentist/{name}")
    public List<Turn> getDentistTurns(@PathVariable String name){
        return turnService.getFilterDentistTurns(name);
    }

    @GetMapping("turns/status/{id}")
    public TurnStatus getTurnsState(@PathVariable String id){
        return turnService.getTurnStatus(id);
    }
}
