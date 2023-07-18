package com.bw4g6.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bw4g6.classes.Stato;
import com.bw4g6.classes.TipoMezzo;

@Entity
@Table(name = "mezzi")
public class Mezzo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_mezzo", nullable = false)
	private TipoMezzo tipoMezzo;
	
	@Column(name="n_posti", nullable = false)
	private int nPosti;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Stato stato;
	
	@ManyToOne
	private Tratta tratta;
	public Mezzo() {}
	
	public Mezzo(TipoMezzo tipoMezzo, Stato stato, Tratta tratta) {
		super();
		this.tipoMezzo = tipoMezzo;
		this.stato = stato;
		this.tratta = tratta;
		if(this.tipoMezzo==TipoMezzo.AUTOBUS) this.nPosti=50;
		else this.nPosti=30;
	}

	public TipoMezzo getTipoMezzo() {
		return tipoMezzo;
	}

	public void setTipoMezzo(TipoMezzo tipoMezzo) {
		this.tipoMezzo = tipoMezzo;
	}

	public int getnPosti() {
		return nPosti;
	}

	public void setnPosti(int nPosti) {
		this.nPosti = nPosti;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Mezzo [id=" + id + ", tipoMezzo=" + tipoMezzo + ", nPosti=" + nPosti + ", stato=" + stato + "]";
	}
}
