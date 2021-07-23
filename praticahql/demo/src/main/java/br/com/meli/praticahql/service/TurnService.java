package br.com.meli.praticahql.service;

import br.com.meli.praticahql.dao.TurnDAO;
import br.com.meli.praticahql.model.Turn;

import javax.persistence.EntityManager;
import java.util.List;

public class TurnService {
    private TurnDAO turnDAO;


    public TurnService(EntityManager em) {
        super();
        this.turnDAO = new TurnDAO(em);
    }

    public List<Turn> list(){
        return turnDAO.list();
    }

    public List<Turn> turnWithFinal(){
        return turnDAO.turnWithFinal();
    }

    public List<Turn> dentistTurns(long id){
        return turnDAO.dentistTurns(id);
    }

    public List<Turn> dentistTurnsRemarqued(long id){
        return turnDAO.dentistTurnsRemarqued(id);
    }

    public List<Turn> listWithoutDay(){
        return turnDAO.listWithoutDay();
    }

}
