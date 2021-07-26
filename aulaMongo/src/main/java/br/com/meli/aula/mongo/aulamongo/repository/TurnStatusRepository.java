package br.com.meli.aula.mongo.aulamongo.repository;

import br.com.meli.aula.mongo.aulamongo.model.Dentist;
import br.com.meli.aula.mongo.aulamongo.model.TurnStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface TurnStatusRepository extends MongoRepository<TurnStatus, Integer> {}