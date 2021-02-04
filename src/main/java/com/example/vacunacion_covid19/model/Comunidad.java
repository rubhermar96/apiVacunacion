package com.example.vacunacion_covid19.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comunidades")
public class Comunidad {

	private int id;
	private String nombre;
	private int dosis_Pfizer;
	private int dosis_Moderna;
	private int dosis_AstraZeneca;
	private int administradas_totales;
	private int pauta_completa;
	public Comunidad () {}
	public Comunidad(int id, String nombre, int dosis_Pfizer, int dosis_Moderna, int dosis_AstraZeneca,
			int administradas_totales, int pauta_completa) {
		this.id = id;
		this.nombre = nombre;
		this.dosis_Pfizer = dosis_Pfizer;
		this.dosis_Moderna = dosis_Moderna;
		this.dosis_AstraZeneca = dosis_AstraZeneca;
		this.administradas_totales = administradas_totales;
		this.pauta_completa = pauta_completa;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDosis_Pfizer() {
		return dosis_Pfizer;
	}
	public void setDosis_Pfizer(int dosis_Pfizer) {
		this.dosis_Pfizer = dosis_Pfizer;
	}
	public int getDosis_Moderna() {
		return dosis_Moderna;
	}
	public void setDosis_Moderna(int dosis_Moderna) {
		this.dosis_Moderna = dosis_Moderna;
	}
	public int getDosis_AstraZeneca() {
		return dosis_AstraZeneca;
	}
	public void setDosis_AstraZeneca(int dosis_AstraZeneca) {
		this.dosis_AstraZeneca = dosis_AstraZeneca;
	}
	public int getAdministradas_totales() {
		return administradas_totales;
	}
	public void setAdministradas_totales(int administradas_totales) {
		this.administradas_totales = administradas_totales;
	}
	public int getPauta_completa() {
		return pauta_completa;
	}
	public void setPauta_completa(int pauta_completa) {
		this.pauta_completa = pauta_completa;
	};
	
}
