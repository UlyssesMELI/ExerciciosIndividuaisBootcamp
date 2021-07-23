package br.com.meli.praticahql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.meli.praticahql.model.Patient;

public class PatientDAO {

	private EntityManager em;
	
	public PatientDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<Patient> list() {
		TypedQuery<Patient> qry = this.em.createQuery("select * from Patient", Patient.class);
		return qry.getResultList();
	}
	
}
