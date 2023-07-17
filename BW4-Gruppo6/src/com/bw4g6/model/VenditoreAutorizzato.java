package com.bw4g6.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "venditori_autorizzati")
public class VenditoreAutorizzato extends Venditore{
	
	@Column(name="orario_apertura", nullable = false)
	private LocalTime orarioApertura;
	
	@Column(name="orario_chiusura", nullable = false)
	private LocalTime orarioChiusura;
	
	public VenditoreAutorizzato() {}
	
	public VenditoreAutorizzato(LocalTime orarioApertura, LocalTime orarioChiusura) {
		super();
		this.orarioApertura = orarioApertura;
		this.orarioChiusura = orarioChiusura;
	}

	public LocalTime getOrarioApertura() {
		return orarioApertura;
	}

	public void setOrarioApertura(LocalTime orarioApertura) {
		this.orarioApertura = orarioApertura;
	}

	public LocalTime getOrarioChiusura() {
		return orarioChiusura;
	}

	public void setOrarioChiusura(LocalTime orarioChiusura) {
		this.orarioChiusura = orarioChiusura;
	}

	@Override
	public String toString() {
		return "VenditoreAutorizzato [orarioApertura=" + orarioApertura + ", orarioChiusura=" + orarioChiusura + ", id="
				+ id + ", ticketVenduti=" + ticketVenduti + "]";
	}
}