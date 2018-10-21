package com.sssm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

// if schema already contains a table whose name matches POJO name, nothing additional needs to be done
// if table generation is set to automatic and a different table name is desired than POJO name, modify annotation - e.g. @Entity(name="athelete_table") or @Table(name="athelete_table")
@Entity
public class Athlete {

	@Id
	private int id;
	// @Column is optional - use if a different column name is desired in table
	@Column(name = "first")
	private String firstName;
	private String lastName;
	// use @Transient if this field should not be persisted
	@Transient
	private String doNotStore;

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

	public String getDoNotStore() {
		return doNotStore;
	}

	public void setDoNotStore(String doNotStore) {
		this.doNotStore = doNotStore;
	}

	@Override
	public String toString() {
		return "Athlete [" + "first name = " + this.firstName + ", last name = " + this.lastName + "]";
	}

}
