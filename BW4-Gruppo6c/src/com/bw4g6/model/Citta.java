package com.bw4g6.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "citta")
public class Citta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false, unique=true)
	private int cap;
	
	@ManyToMany(mappedBy="citta")
	private Set<Tratta> tratte;
	
	public Citta() {}

	public Citta(String nome, int cap) {
		super();
		this.nome = nome;
		this.cap = cap;
	}

	public String getCapolinea() {
		return nome;
	}

	public void setCapolinea(String capolinea) {
		this.nome = capolinea;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public Long getId() {
		return id;
	}

	public Set<Tratta> getTratte() {
		return tratte;
	}

	@Override
	public String toString() {
		return "Citta [id=" + id + ", capolinea=" + nome + ", cap=" + cap + ", tratte=" + tratte + "]";
	}
	
}
