package br.com.meli.praticahql.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Diary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate startTime;
	private LocalDate endingTime;
	
	@ManyToOne
	private Dentist dentist;
	
	public Diary() {
		super();
	}

	public Diary(LocalDate startTime, LocalDate endingTime, Dentist dentist) {
		super();
		this.startTime = startTime;
		this.endingTime = endingTime;
		this.dentist = dentist;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(LocalDate endingTime) {
		this.endingTime = endingTime;
	}

	public Dentist getDentists() {
		return dentist;
	}

	public void setDentists(Dentist dentists) {
		this.dentist = dentist;
	}
	
	
	
	
	
}
