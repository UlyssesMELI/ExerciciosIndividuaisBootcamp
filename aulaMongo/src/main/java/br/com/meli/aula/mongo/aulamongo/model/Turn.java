package br.com.meli.aula.mongo.aulamongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "Turn")
public class Turn {

	@Id
	private String id;
	
	private LocalDate day;
	
	private Diary diary;
	
	private TurnStatus turnStatus;
	
	private Patient patient;
	
	public Turn() {
		super();
	}

	public Turn(LocalDate day, Diary diary, TurnStatus turnStatus, Patient patient) {
		super();
		this.day = day;
		this.diary = diary;
		this.turnStatus = turnStatus;
		this.patient = patient;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	public Diary getDiary() {
		return diary;
	}

	public void setDiary(Diary diary) {
		this.diary = diary;
	}

	public TurnStatus getTurnStatus() {
		return turnStatus;
	}

	public void setTurnStatus(TurnStatus turnStatus) {
		this.turnStatus = turnStatus;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
	
}
