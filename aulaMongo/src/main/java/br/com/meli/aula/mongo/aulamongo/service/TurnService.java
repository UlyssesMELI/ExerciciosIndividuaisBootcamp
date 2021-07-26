package br.com.meli.aula.mongo.aulamongo.service;

import br.com.meli.aula.mongo.aulamongo.model.Dentist;
import br.com.meli.aula.mongo.aulamongo.model.Patient;
import br.com.meli.aula.mongo.aulamongo.model.Turn;
import br.com.meli.aula.mongo.aulamongo.model.TurnStatus;
import br.com.meli.aula.mongo.aulamongo.repository.PatientRepository;
import br.com.meli.aula.mongo.aulamongo.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnService {
    private TurnRepository turnRepository;
    private MongoTemplate mongoTemplate;

    @Autowired
    TurnService(TurnRepository turnRepository,MongoTemplate mongoTemplate) {
        this.turnRepository = turnRepository;
        this.mongoTemplate = mongoTemplate;
    }

    public void insert(Turn turn){
        this.turnRepository.insert(turn);
    }

    public List<Turn> getAllTurns(){
        return this.turnRepository.findAll();
    }

    public List<Turn> getFilterDentistTurns(String name) {
        return this.turnRepository.getByDentist(name);
    }

    public TurnStatus getTurnStatus(String id) {
        return this.turnRepository.findById(id).getTurnStatus();
    }
}
