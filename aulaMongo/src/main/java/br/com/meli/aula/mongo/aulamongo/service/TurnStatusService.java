package br.com.meli.aula.mongo.aulamongo.service;

import br.com.meli.aula.mongo.aulamongo.model.Patient;
import br.com.meli.aula.mongo.aulamongo.model.TurnStatus;
import br.com.meli.aula.mongo.aulamongo.repository.PatientRepository;
import br.com.meli.aula.mongo.aulamongo.repository.TurnStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnStatusService {
    private TurnStatusRepository turnStatusRepository;

    @Autowired
    TurnStatusService(TurnStatusRepository turnStatusRepository) {
        this.turnStatusRepository = turnStatusRepository;
    }

    public void insert(TurnStatus turnStatus){
        this.turnStatusRepository.insert(turnStatus);
    }
}
