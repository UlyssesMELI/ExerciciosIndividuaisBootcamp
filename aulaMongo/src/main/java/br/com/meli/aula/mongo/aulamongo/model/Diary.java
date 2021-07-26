package br.com.meli.aula.mongo.aulamongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "Diary")
public class Diary {
	
	@Id
	private String id;
	
	private LocalDate startTime;
	private LocalDate endingTime;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
