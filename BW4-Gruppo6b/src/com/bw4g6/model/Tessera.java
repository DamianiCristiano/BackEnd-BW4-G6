package com.bw4g6.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tessere")
public class Tessera {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDate dataConvalida;
	
	@Column(nullable = false)
	private LocalDate dataScadenza;
	
	@OneToOne
	private Abbonamento abbonamento;
	
	@OneToOne(mappedBy="tessera")
	private Utente utente;
	
	public Tessera() {}
	
	public Tessera(LocalDate dataConvalida) {
		super();
		this.dataConvalida = dataConvalida;
		this.dataScadenza=this.dataConvalida.plusYears(1);
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

	public Utente getUtente() {
		return utente;
	}

	@Override
	public String toString() {
		return "Tessera [id=" + id + ", dataConvalida=" + dataConvalida + ", dataScadenza=" + dataScadenza+"]";
	}

}
