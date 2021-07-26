package br.com.meli.aula.mongo.aulamongo.controller;

import br.com.meli.aula.mongo.aulamongo.model.Dentist;
import br.com.meli.aula.mongo.aulamongo.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DentistController {

    DentistService dentistService;

    @Autowired
    DentistController(DentistService dentistService){
        this.dentistService = dentistService;
    }

    @GetMapping("/test_incert")
    public String insertDentist(){
        dentistService.insert(new Dentist("Ulysses"));
        return "inserido";
    }

}
