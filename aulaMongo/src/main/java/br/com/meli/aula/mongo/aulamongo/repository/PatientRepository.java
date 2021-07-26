package br.com.meli.aula.mongo.aulamongo.repository;

import br.com.meli.aula.mongo.aulamongo.model.Dentist;
import br.com.meli.aula.mongo.aulamongo.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface PatientRepository extends MongoRepository<Patient, Integer> {}

