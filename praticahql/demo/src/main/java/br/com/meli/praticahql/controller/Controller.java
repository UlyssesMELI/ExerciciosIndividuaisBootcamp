package br.com.meli.praticahql.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.meli.praticahql.model.Diary;
import br.com.meli.praticahql.model.Patient;
import br.com.meli.praticahql.model.Turn;
import br.com.meli.praticahql.model.TurnStatus;
import br.com.meli.praticahql.service.TurnService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.praticahql.model.Dentist;
import br.com.meli.praticahql.service.DentistService;

import org.hibernate.tool.hbm2ddl.SchemaExport;


@RestController
public class Controller {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("aulabancos");
	EntityManager em = factory.createEntityManager();
	
	DentistService dentistService = new DentistService(em);
	TurnService turnService = new TurnService(em);
	
	

	
	@GetMapping("/dentist")
	public List<Dentist> listDentist(){
		return dentistService.listDentist();
	}

	@GetMapping("/dentist2m")
	public List<Dentist> listDentist2m(){
		return dentistService.listMoreThan2Turns();
	}

	@GetMapping("/turn-final")
	public List<Turn> turnWithFinal(){
		return turnService.turnWithFinal();
	}

	@GetMapping("/turns-dentist/{id}")
	public List<Turn> dentistTurns(@PathVariable long id){
		return turnService.dentistTurns(id);
	}
	@GetMapping("/turns-dentist-remarqued/{id}")
	public List<Turn> dentistTurnsRemarqued(@PathVariable long id){
		return turnService.dentistTurnsRemarqued(id);
	}

	@GetMapping("/list-without-day")
	public List<Turn> listWithoutDay(){
		return turnService.listWithoutDay();
	}

}
