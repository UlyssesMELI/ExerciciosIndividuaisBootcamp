package br.com.meli.aula.mongo.aulamongo.repository;

import br.com.meli.aula.mongo.aulamongo.model.Dentist;
import br.com.meli.aula.mongo.aulamongo.model.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface DiaryRepository extends MongoRepository<Diary, Integer> {}