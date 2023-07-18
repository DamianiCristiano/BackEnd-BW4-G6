package com.bw4g6.classes;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bw4g6.model.Abbonamento;
import com.bw4g6.model.Tessera;
import com.bw4g6.model.Utente;

public class EntityMethods {
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("BW4-Gruppo6");
	private static EntityManager em=emf.createEntityManager();
	
	public static <T> void save(T entity) throws SQLException {
	    em.getTransaction().begin();
	    em.persist(entity);
	    em.getTransaction().commit();
	}
	
	public static <T> T getById(long id, Class<T> entityType) throws SQLException {
	    em.getTransaction().begin();
	    T entity = em.find(entityType, id);
	    em.getTransaction().commit();
	    return entity;
	}
	
	public static List<Utente> getUserWithCard() throws SQLException
	{
		Query q=em.createQuery("SELECT t.utente FROM Tessera t WHERE CURRENT_DATE < t.dataScadenza");
		try {
			return q.getResultList();
		}catch (NoResultException e) {
            return null;
        }
	}
	
	public static Boolean validitaAbbonamento(Long id) throws SQLException
	{
		Query q=em.createQuery("SELECT t.abbonamento FROM Tessera t WHERE t.id = :id AND t.abbonamento.dataScadenza > CURRENT_DATE");
		q.setParameter("id", id);
		try {
			return q.getSingleResult() != null;
		}catch (NoResultException e) {
            return false;
        }
	}
	
	public static List<Object> getTicketVenduti(LocalDate x, LocalDate y) throws SQLException
	{
		Query q=em.createQuery("SELECT t.venditore.id, COUNT(t.id) FROM Ticket t WHERE t.dataConvalida BETWEEN :x AND :y GROUP BY t.venditore");
		q.setParameter("x", x);
		q.setParameter("y", y);
		try {
			return q.getResultList();
		}catch (NoResultException e) {
            return null;
        }
	}
}
