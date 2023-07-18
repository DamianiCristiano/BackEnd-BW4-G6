package com.bw4g6.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tratte")
public class Tratta {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="zona_partenza", nullable = false)
	private String zonaPartenza;
	
	@Column(nullable = false)
	private String capolinea;
	
	@Column(nullable = false)
	private LocalTime durata;
	
	public Tratta(){}
	
	public Tratta(String zonaPartenza, String capolinea, LocalTime durata) {
		super();
		this.zonaPartenza = zonaPartenza;
		this.capolinea = capolinea;
		this.durata = durata;
	}

	public String getZonaPartenza() {
		return zonaPartenza;
	}

	public void setZonaPartenza(String zonaPartenza) {
		this.zonaPartenza = zonaPartenza;
	}

	public String getCapolinea() {
		return capolinea;
	}

	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}

	public LocalTime getDurata() {
		return durata;
	}

	public void setDurata(LocalTime durata) {
		this.durata = durata;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Tratta [id=" + id + ", zonaPartenza=" + zonaPartenza + ", capolinea=" + capolinea + ", durata=" + durata
				+ "]";
	}
	
}
