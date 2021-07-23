package br.com.meli.praticahql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.meli.praticahql.model.Dentist;

public class DentistDAO {
	
	private EntityManager em;
	
	public DentistDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<Dentist> list() {
		TypedQuery<Dentist> qry = this.em.createQuery("from Dentist", Dentist.class);
		return qry.getResultList();
	}

	public List<Dentist> listMoreThan2Turns() {
		TypedQuery<Dentist> qry = this.em.createQuery("select d from Dentist d join Diary t on t.dentist = d.id group by d having count(t.dentist) >= 2", Dentist.class);
		return qry.getResultList();
	}

	public List<Dentist> dentist() {
		TypedQuery<Dentist> qry = this.em.createQuery("select d from Dentist d join Diary t on t.dentist = d.id group by d having count(t.dentist) >= 2", Dentist.class);
		return qry.getResultList();
	}

}
