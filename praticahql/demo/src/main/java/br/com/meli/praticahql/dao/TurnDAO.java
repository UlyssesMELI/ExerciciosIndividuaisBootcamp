package br.com.meli.praticahql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.meli.praticahql.model.Turn;
import br.com.meli.praticahql.model.TurnStatus;

public class TurnDAO {

	private EntityManager em;
	
	public TurnDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<Turn> list() {
		TypedQuery<Turn> qry = this.em.createQuery("select * from TurnDAO", Turn.class);
		return qry.getResultList();
	}

	public List<Turn> turnWithFinal() {
		TypedQuery<Turn> qry = this.em.createQuery("select d from Turn d inner join TurnStatus t on d.turnStatus = t.id  where t.name = 'Final'", Turn.class);
		return qry.getResultList();
	}


	public List<Turn> listWithoutDay() {
		TypedQuery<Turn> qry = this.em.createQuery("select t from Turn t where t.day is null", Turn.class);
		return qry.getResultList();
	}

	public List<Turn> dentistTurns(long dentistId) {
		TypedQuery<Turn> qry = this.em.createQuery("select t from Turn t inner join Diary d on t.diary=d where d.dentist.id = :dentistId", Turn.class)
				.setParameter("dentistId",dentistId);
		return qry.getResultList();
	}

	public List<Turn> dentistTurnsRemarqued(long dentistId) {
		TypedQuery<Turn> qry = this.em.createQuery("select t from Turn t inner join Diary d on t.diary=d inner join TurnStatus ts on t.turnStatus = ts.id where ts.name = 'Remarcado' and d.dentist.id= :dentistId", Turn.class)
				.setParameter("dentistId",dentistId);
		return qry.getResultList();
	}
}