package br.com.meli.praticahql.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dentist {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String lastName;
	private String address;
	private String dni;
	private LocalDate BirthDate;
	private String phone;
	private String email;
	private String codeMP;
	
	public Dentist() {
		super();
	}
	
	public Dentist(String name, String lastName, String address, String dni, LocalDate birthDate, String phone,
			String email, String codeMP) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.dni = dni;
		BirthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.codeMP = codeMP;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
		return BirthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
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

	public String getCodeMP() {
		return codeMP;
	}

	public void setCodeMP(String codeMP) {
		this.codeMP = codeMP;
	}	
	
}
