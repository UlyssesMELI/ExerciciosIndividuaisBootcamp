package br.com.meli.aula.mongo.aulamongo.repository;

import br.com.meli.aula.mongo.aulamongo.model.Turn;
import br.com.meli.aula.mongo.aulamongo.model.TurnStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TurnRepository extends MongoRepository<Turn, Integer> {

    @Query(value="{'diary.dentist.name':'?0'}")
    public List<Turn> getByDentist(String name);

    public Turn findById(String id);
}