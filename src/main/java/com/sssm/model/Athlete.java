package com.sssm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// currently, schema has a table with the name athlete
// if the name of the table inside schema is same as the POJO name, nothing additional needs to be done
@Entity
public class Athlete {

	@Id
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
