package com.example.menus.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMenu;
	private String nomMenu;
	private Double prixMenu;
	private Date dateCreation;
	
	@ManyToOne
	private Restaurant restaurant; 
	
	public Menu() {
		
	}
	
	public Menu(String nomMenu, Double prixMenu, Date dateCreation) {
		this.nomMenu = nomMenu;
		this.prixMenu = prixMenu;
		this.dateCreation = dateCreation;
	}
	public Long getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}
	public String getNomMenu() {
		return nomMenu;
	}
	public void setNomMenu(String nomMenu) {
		this.nomMenu = nomMenu;
	}
	public Double getPrixMenu() {
		return prixMenu;
	}
	public void setPrixMenu(Double prixMenu) {
		this.prixMenu = prixMenu;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	@Override
	public String toString() {
		return "Menu [idMenu=" + idMenu + ", nomMenu=" + nomMenu + ", prixMenu=" + prixMenu + ", dateCreation="
				+ dateCreation + "]";
	}

	


}
