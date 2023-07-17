package com.bw4g6.classes;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
}
