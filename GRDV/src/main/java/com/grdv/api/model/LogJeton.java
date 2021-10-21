package com.grdv.api.model;
import java.util.Date;

public class LogJeton{
	
	private String jeton;
	private Personne personne;
	private int dure;
	private Date dateCreation;
	public LogJeton() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LogJeton(String jeton, Personne personne, int dure, Date dateCreation) {
		super();
		this.jeton = jeton;
		this.personne = personne;
		this.dure = dure;
		this.dateCreation = dateCreation;
	}
	public String getJeton() {
		return jeton;
	}
	public void setJeton(String jeton) {
		this.jeton = jeton;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public int getDure() {
		return dure;
	}
	public void setDure(int dure) {
		this.dure = dure;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
}
