package com.bw4g6.model;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tratte")
public class Tratta {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*@Column(name="zona_partenza", nullable = false)
	private String zonaPartenza;
	
	@Column(nullable = false)
	private String capolinea;*/
	
	@ManyToMany
	private Set<Citta> citta;
	
	@Column(nullable = false)
	private LocalTime durata;
	
	public Tratta(){}
	
	public Tratta(Set<Citta> citta, LocalTime durata) {
		super();
		this.citta=citta;
		this.durata = durata;
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
	
}
