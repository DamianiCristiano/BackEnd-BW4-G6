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
	
	@OneToOne
	private Utente utente;
	
	public Abbonamento(){}
	
	public Abbonamento(LocalDate dataConvalida, Periodicita periodicita, Utente utente, Venditore venditore, Tratta tratta) {
		super(dataConvalida, tratta, venditore);
		this.periodicita = periodicita;
		this.utente=utente;
		
		if(this.periodicita==Periodicita.SETTIMANALE) this.dataScadenza=this.dataConvalida.plusDays(7);
		else this.dataScadenza=this.dataConvalida.plusDays(30);
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "Abbonamento [id=" + id + ", dataConvalida=" + dataConvalida + ", dataScadenza=" + dataScadenza
				+ ", periodicita=" + periodicita + ", utente=" + utente + "]";
	}
}
