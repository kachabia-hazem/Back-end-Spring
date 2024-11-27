package com.hazem.medicaments.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
 @Data
 @NoArgsConstructor 
@Entity

public class Medicament {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMed;
	private String nomMed;
	private String descMed;
	private String marqueMed;
	private String url;
	private int code;
	@ManyToOne
    @JoinColumn(name = "classification_id", referencedColumnName = "id") // Ensure the join column matches the database schema
    private Classification classification;
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	 public Medicament() {
		super();
		
	// TODO Auto-generated constructor stub
	 }
	// Constructor for initialization (if needed)
    public Medicament(String nomMed, String descMed, String marqueMed, String url, Double prixMed,int code, Date dateCreation, Date dateExpiration) {
        this.nomMed = nomMed;
        this.descMed = descMed;
        this.marqueMed = marqueMed;
        this.url = url;
        this.prixMed = prixMed;
        this.code=code;
        this.dateCreation = dateCreation;
        this.dateExpiration = dateExpiration;
    }
	public Long getIdMed() {
		return idMed;
	}
	public void setIdMed(Long idMed) {
		this.idMed = idMed;
	}
	public String getNomMed() {
		return nomMed;
	}
	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	}
	public String getDescMed() {
		return descMed;
	}
	public void setDescMed(String descMed) {
		this.descMed = descMed;
	}
	public String getMarqueMed() {
		return marqueMed;
	}
	public void setMarqueMed(String marqueMed) {
		this.marqueMed = marqueMed;
	}
	public Double getPrixMed() {
		return prixMed;
	}
	public void setPrixMed(Double prixMed) {
		this.prixMed = prixMed;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	private Double prixMed;
	private Date dateCreation;
	private Date dateExpiration;

	@Override
	public String toString() {
		return "Medicament [idMed=" + idMed + ", nomMed=" + nomMed + ", descMed=" + descMed + ", marqueMed=" + marqueMed
				+ ", prixMed=" + prixMed + ", dateCreation=" + dateCreation + ", dateExpiration=" + dateExpiration
				+ "]";
	}
	
	
		
	

}
