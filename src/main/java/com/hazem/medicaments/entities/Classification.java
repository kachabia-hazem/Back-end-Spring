package com.hazem.medicaments.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Classification {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nomClass;
	private String descriptionClass;
	
	
	@OneToMany(mappedBy="classification")
	@JsonIgnore
	private List<Medicament> medicaments;
	
	
	public List<Medicament> getMedicaments() {
		return medicaments;
	}
	public void setMedicaments(List<Medicament> medicaments) {
		this.medicaments = medicaments;
	}
	public Classification() {
		super();
	}
	public Long getIdClass() {
		return id;
	}
	public void setIdClass(Long idClass) {
		this.id = idClass;
	}
	public String getNomClass() {
		return nomClass;
	}
	public void setNomClass(String nomClass) {
		this.nomClass = nomClass;
	}
	public String getDescriptionClass() {
		return descriptionClass;
	}
	public void setDescriptionClass(String descriptionClass) {
		this.descriptionClass = descriptionClass;
	}
	

}
