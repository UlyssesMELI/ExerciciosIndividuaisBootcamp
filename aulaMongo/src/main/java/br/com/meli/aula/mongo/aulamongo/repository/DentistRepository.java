package br.com.meli.aula.mongo.aulamongo.repository;

import br.com.meli.aula.mongo.aulamongo.model.Dentist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface DentistRepository extends MongoRepository<Dentist, Integer>{}
