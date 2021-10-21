package com.grdv.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Prospect extends Personne{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany
	private List<Rdv> rdv;

	public List<Rdv> getRdv() {
		return rdv;
	}

	public void setRdv(List<Rdv> rdv) {
		this.rdv = rdv;
	}
	
}
