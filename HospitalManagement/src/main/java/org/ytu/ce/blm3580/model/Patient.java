package org.ytu.ce.blm3580.model;

import java.util.Date;

import org.hibernate.annotations.Table;

@Table(appliesTo = "Patient")
public class Patient {

	private int ss;
	private int doctorDss;
	private String insurance;
	private Date dateAdmitted;
	private Date dateCheckout;
	private int personId;

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {
		this.ss = ss;
	}

	public int getDoctorDss() {
		return doctorDss;
	}

	public void setDoctorDss(int doctorDss) {
		this.doctorDss = doctorDss;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public Date getDateAdmitted() {
		return dateAdmitted;
	}

	public void setDateAdmitted(Date dateAdmitted) {
		this.dateAdmitted = dateAdmitted;
	}

	public Date getDateCheckout() {
		return dateCheckout;
	}

	public void setDateCheckout(Date dateCheckout) {
		this.dateCheckout = dateCheckout;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

}
