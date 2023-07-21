package com.bw4g6.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bw4g6.classes.TipoMezzo;

@Entity
@Table(name = "biglietti")
public class Biglietto extends Ticket{
	
@ManyToOne
private Mezzo mezzo;	
	public Biglietto(){}
	
	public Biglietto(LocalDate dataAcquisto, Venditore venditore, Tratta tratta, Mezzo mezzo ) {
		super(dataAcquisto, tratta, venditore);
		this.mezzo = mezzo;
	}

	@Override
	public String toString() {
		return "Biglietto [id=" + id + ", dataAcquisto=" + dataAcquisto + ", dataScadenza=" + dataScadenza + "]";
	}
}
