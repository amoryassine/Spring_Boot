package com.yassine.voiture.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idvoiture ;
	private String marque;
	private String modele;
	private String immatriculation;
	private String couleur;
	private String puissance_fiscale;
	private Double prix_par_heure ;
	private Date date_creation_voiture;
	

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Voiture(String marque, String modele, String immatriculation, String couleur, String puissance_fiscale,
			Double prix_par_heure, Date date_creation_voiture) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.immatriculation = immatriculation;
		this.couleur = couleur;
		this.puissance_fiscale = puissance_fiscale;
		this.prix_par_heure = prix_par_heure;
		this.date_creation_voiture = date_creation_voiture;
	}
	
	

	public Long getIdvoiture() {
		return idvoiture;
	}
	

	public void setIdvoiture(Long idvoiture) {
		this.idvoiture = idvoiture;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getPuissance_fiscale() {
		return puissance_fiscale;
	}

	public void setPuissance_fiscale(String puissance_fiscale) {
		this.puissance_fiscale = puissance_fiscale;
	}

	public Double getPrix_par_heure() {
		return prix_par_heure;
	}

	public void setPrix_par_heure(Double prix_par_heure) {
		this.prix_par_heure = prix_par_heure;
	}

	public Date getDate_creation_voiture() {
		return date_creation_voiture;
	}

	public void setDate_creation_voiture(Date date_creation_voiture) {
		this.date_creation_voiture = date_creation_voiture;
	}

	@Override
	public String toString() {
		return "Voiture [idvoiture=" + idvoiture + ", marque=" + marque + ", modele=" + modele + ", immatriculation="
				+ immatriculation + ", couleur=" + couleur + ", puissance_fiscale=" + puissance_fiscale
				+ ", prix_par_heure=" + prix_par_heure + ", date_creation_voiture=" + date_creation_voiture + "]";
	}
	
	
	
	
	

}