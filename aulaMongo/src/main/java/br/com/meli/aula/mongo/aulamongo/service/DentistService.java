package br.com.meli.aula.mongo.aulamongo.service;

import br.com.meli.aula.mongo.aulamongo.model.Dentist;
import br.com.meli.aula.mongo.aulamongo.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DentistService {

    private DentistRepository dentistRepository;

    @Autowired
    DentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    public void insert(Dentist dentist){
        this.dentistRepository.insert(dentist);
    }

}
