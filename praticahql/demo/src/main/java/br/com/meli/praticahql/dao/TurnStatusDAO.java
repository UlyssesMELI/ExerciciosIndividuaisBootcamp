package br.com.meli.praticahql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.meli.praticahql.model.TurnStatus;

public class TurnStatusDAO {

	private EntityManager em;
	
	public TurnStatusDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<TurnStatus> list() {
		TypedQuery<TurnStatus> qry = this.em.createQuery("select * from TurnStatus", TurnStatus.class);
		return qry.getResultList();
	}
	
}
