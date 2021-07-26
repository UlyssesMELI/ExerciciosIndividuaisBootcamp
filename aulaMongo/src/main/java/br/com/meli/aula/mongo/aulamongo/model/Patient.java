package br.com.meli.aula.mongo.aulamongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

@Document(collection = "Patient")
public class Patient {
	@Id
	private String id;
	
	private String name;
	private String lastName;
	private String address;
	private String dni;
	private LocalDate birthDate;
	private String phone;
	private String email;
	
	public Patient() {
		super();
	}

	public Patient(String name, String lastName, String address, String dni, LocalDate birthDate, String phone,
			String email) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.dni = dni;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
