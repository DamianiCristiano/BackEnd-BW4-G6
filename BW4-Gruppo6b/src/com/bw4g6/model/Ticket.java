package com.bw4g6.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Ticket {
	
	@Id
    @SequenceGenerator(name = "vol_seq2", sequenceName = "vol_seq2", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vol_seq2")
	protected Long id;
	
	@Column(name="data_convalida", nullable = false)
	protected LocalDate dataConvalida;
	
	@Column(name="data_scadenza", nullable = false)
	protected LocalDate dataScadenza;
	
	@ManyToOne
	protected Tratta tratta;
	
	@ManyToOne
	protected Venditore venditore;
	
	public Ticket() {}
	
	public Ticket(LocalDate dataConvalida, Tratta tratta, Venditore venditore) {
		super();
		this.dataConvalida = dataConvalida;
		this.tratta = tratta;
		this.venditore = venditore;
	}

	public LocalDate getDataConvalida() {
		return dataConvalida;
	}
	
	public void setDataConvalida(LocalDate dataConvalida) {
		this.dataConvalida = dataConvalida;
	}
	
	public LocalDate getDataScadenza() {
		return dataScadenza;
	}
	
	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	
	public Long getId() {
		return id;
	}
}
