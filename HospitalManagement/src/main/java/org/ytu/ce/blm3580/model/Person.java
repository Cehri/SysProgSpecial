package org.ytu.ce.blm3580.model;

import org.hibernate.annotations.Table;

@Table(appliesTo = "Person")
public class Person {

	private int id;
	private int personTypeID;
	private String name;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonTypeID() {
		return personTypeID;
	}

	public void setPersonTypeID(int personTypeID) {
		this.personTypeID = personTypeID;
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

	public Person() {

	}

	public Person(int id, int personTypeID, String name, String lastName) {
		super();
		this.id = id;
		this.personTypeID = personTypeID;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", personTypeID=" + personTypeID + ", name=" + name + ", lastName=" + lastName
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + personTypeID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (personTypeID != other.personTypeID)
			return false;
		return true;
	}

}
