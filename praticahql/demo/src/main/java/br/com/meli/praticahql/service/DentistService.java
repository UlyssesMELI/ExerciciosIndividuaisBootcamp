package br.com.meli.praticahql.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.meli.praticahql.dao.DentistDAO;
import br.com.meli.praticahql.model.Dentist;

public class DentistService {

	private DentistDAO dentistDAO;

	public DentistService(EntityManager em) {
		super();
		this.dentistDAO = new DentistDAO(em);
	}
	
	public List<Dentist> listDentist(){
		return dentistDAO.list();
	}

	public List<Dentist> listMoreThan2Turns(){
		return dentistDAO.listMoreThan2Turns();
	}
	
	
	
}
