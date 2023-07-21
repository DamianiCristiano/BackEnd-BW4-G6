package com.bw4g6.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Venditore {
	
	@Id
    @SequenceGenerator(name = "vol_seq", sequenceName = "vol_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vol_seq")
	protected Long id;
	
	@OneToMany(mappedBy="venditore")
	protected List<Ticket> ticketVenduti;

	public Long getId() {
		return id;
	}

	public List<Ticket> getTicketVenduti() {
		return ticketVenduti;
	}
}
