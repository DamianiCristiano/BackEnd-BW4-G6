package com.bw4g6.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bw4g6.classes.Periodicita;

@Entity
@Table(name = "abbonamenti")
public class Abbonamento extends Ticket{
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Periodicita periodicita;
	
	public Abbonamento(){}
	
	public Abbonamento(LocalDate dataConvalida, Periodicita periodicita, Venditore venditore, Tratta tratta) {
		super(dataConvalida, tratta, venditore);
		this.periodicita = periodicita;
		
		if(this.periodicita==Periodicita.SETTIMANALE) this.dataScadenza=this.dataConvalida.plusDays(7);
		else this.dataScadenza=this.dataConvalida.plusDays(30);
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Abbonamento [id=" + id + ", dataConvalida=" + dataConvalida + ", dataScadenza=" + dataScadenza
				+ ", periodicita=" + periodicita +"]";
	}
}
