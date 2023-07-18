package com.bw4g6.main;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bw4g6.classes.EntityMethods;
import com.bw4g6.classes.Periodicita;
import com.bw4g6.classes.Stato;
import com.bw4g6.classes.StatoDistributore;
import com.bw4g6.classes.TipoMezzo;
import com.bw4g6.model.Abbonamento;
import com.bw4g6.model.Biglietto;
import com.bw4g6.model.DistributoreAutomatico;
import com.bw4g6.model.Mezzo;
import com.bw4g6.model.Tessera;
import com.bw4g6.model.Tratta;
import com.bw4g6.model.Utente;
import com.bw4g6.model.Venditore;
import com.bw4g6.model.VenditoreAutorizzato;

public class Main {

	public static void main(String[] args) {
		
                Utente u1=new Utente("Mario", "Rossi", new Tessera(LocalDate.of(2022, 6, 15)));
                Utente u2=new Utente("Luigi", "Verdi", new Tessera(LocalDate.of(2023, 2, 28)));
                Utente u3=new Utente("Giovanna", "Bianchi", new Tessera(LocalDate.of(2021, 9, 10)));
                Utente u4=new Utente("Anna", "Neri", new Tessera(LocalDate.of(2022, 12, 5)));
                Utente u5=new Utente("Paolo", "Gialli", new Tessera(LocalDate.of(2023, 8, 20)));
                Utente u6=new Utente("Francesca", "Rosa", new Tessera(LocalDate.of(2022, 3, 18)));
                Utente u7=new Utente("Marco", "Blu", new Tessera(LocalDate.of(2021, 7, 22)));
                Utente u8=new Utente("Simona", "Arancio", new Tessera(LocalDate.of(2023, 5, 12)));
                Utente u9=new Utente("Antonio", "Viola", new Tessera(LocalDate.of(2022, 11, 30)));
                Utente u10=new Utente("Laura", "Marrone", new Tessera(LocalDate.of(2021, 4, 6)));
		
		DistributoreAutomatico distAut=new DistributoreAutomatico(StatoDistributore.ATTIVO);
		VenditoreAutorizzato authSeller=new VenditoreAutorizzato(LocalTime.of(6, 30, 0), LocalTime.of(20, 30, 0));
		
		try {
//		EntityMethods.save(new Tratta("Salerno","Reggio Calabria",LocalTime.of(15, 30, 0)));
     	EntityMethods.save(new Mezzo(TipoMezzo.TRAM, Stato.IN_SERVIZIO, EntityMethods.getById(1,Tratta.class) ));
//			
//			EntityMethods.save(u1);
//			EntityMethods.save(u2);
//			EntityMethods.save(u3);
//			EntityMethods.save(u4);
//			EntityMethods.save(u5);
//			EntityMethods.save(u6);
//			EntityMethods.save(u7);
//			EntityMethods.save(u8);
//			EntityMethods.save(u9);
//			EntityMethods.save(u10);
//			
//			
//			EntityMethods.save(distAut);
//			EntityMethods.save(authSeller);
//			
//			EntityMethods.save(new Tratta("Milano", "Monza", LocalTime.of(1, 30, 0)));
//			EntityMethods.save(new Abbonamento(LocalDate.of(2023, 6, 17), Periodicita.MENSILE, EntityMethods.getById(1, Venditore.class), EntityMethods.getById(1, Tratta.class)));
//			EntityMethods.getById(1, Venditore.class);
//			EntityMethods.save(new Biglietto(LocalDate.now(), EntityMethods.getById(1, Venditore.class), EntityMethods.getById(1, Tratta.class), EntityMethods.getById(1, Mezzo.class)));
//			EntityMethods.save(new Biglietto(LocalDate.of(2022, 8, 22), EntityMethods.getById(1, Venditore.class), EntityMethods.getById(1, Tratta.class),EntityMethods.getById(1, Mezzo.class)));
//			EntityMethods.save(new Biglietto(LocalDate.of(2023, 6, 17), EntityMethods.getById(1, Venditore.class), EntityMethods.getById(1, Tratta.class),EntityMethods.getById(1, Mezzo.class)));
//			EntityMethods.getUserWithCard().forEach(u -> System.out.println(u));
//			System.out.println(EntityMethods.validitaAbbonamento(8l));
//			EntityMethods.getTicketVenduti(LocalDate.of(2023, 6, 1), LocalDate.of(2023, 7, 18)).forEach(u -> System.out.println(u));
//			EntityMethods.convalida(10l);
//			System.out.println(EntityMethods.getTicketConvalidati(LocalDate.of(2023, 01, 18), LocalDate.of(2023,02,14))); 
//		    EntityMethods.convalida(11l);
//			System.out.println(EntityMethods.getConvalidaPerMezzo(1)); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
