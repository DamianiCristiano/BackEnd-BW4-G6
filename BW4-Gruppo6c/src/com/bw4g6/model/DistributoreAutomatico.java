package com.bw4g6.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.bw4g6.classes.StatoDistributore;

@Entity
@Table(name = "distributori_automatici")
public class DistributoreAutomatico extends Venditore{
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatoDistributore stato;
	
	public DistributoreAutomatico() {}
	
	public DistributoreAutomatico(StatoDistributore stato) {
		super();
		this.stato = stato;
	}
	public StatoDistributore getStato() {
		return stato;
	}
	public void setStato(StatoDistributore stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "DistributoreAutomatico [stato=" + stato + ", id=" + id +"]";
	}
	
}
