package com.aula4.linktracker.dto;

public class LinkDTO {

	String strLink;
	long access;
	String password;

	public LinkDTO(String strLink, String password) {
		super();
		this.strLink = strLink;
		this.access=0;
		this.password=password;
	}

	public String getStrLink() {
		return strLink;
	}

	public void setStrLink(String strLink) {
		this.strLink = strLink;
	}

	public void addAccess() {
		access++;
	}
	
	public long getAccess() {
		return access;
	}

	public String getPassword() {
		return password;
	}
	
}
