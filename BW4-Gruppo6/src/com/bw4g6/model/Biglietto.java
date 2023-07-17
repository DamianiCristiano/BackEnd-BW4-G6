package com.bw4g6.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "biglietti")
public class Biglietto extends Ticket{
	
	public Biglietto(){}
	
	public Biglietto(LocalDate dataConvalida, Venditore venditore, Tratta tratta) {
		super(dataConvalida, tratta, venditore);
		this.dataScadenza=this.dataConvalida.plusDays(1);
	}

	@Override
	public String toString() {
		return "Biglietto [id=" + id + ", dataConvalida=" + dataConvalida + ", dataScadenza=" + dataScadenza + "]";
	}
}
