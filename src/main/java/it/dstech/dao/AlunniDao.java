package it.dstech.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import it.dstech.models.Alunno;

public class AlunniDao {
	
	private Class entityClass;
	
	public AlunniDao() {
		this.entityClass = Alunno.class;
	}
//bella rega
	public EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager entityMananger = emf.createEntityManager();
		
		return entityMananger;
	}
	
	public Alunno save(Alunno alunno) {
		EntityManager entityMananger = getEntityManager();
		EntityTransaction tx = entityMananger.getTransaction();
		tx.begin();
        try {
        	entityMananger.persist(alunno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
        entityMananger.close();
		return alunno;
	}
	
	public void delete(Integer id) {
		EntityManager entityMananger = getEntityManager();
		EntityTransaction tx = entityMananger.getTransaction();
		tx.begin();
        try {
        	Alunno alunno = (Alunno) entityMananger.find(entityClass, id);
        	entityMananger.remove(alunno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
        entityMananger.close();
	}
	
	public Alunno get(Integer id) {
		EntityManager entityMananger = getEntityManager();
		
		Alunno alunno = (Alunno) entityMananger.find(entityClass, id);
		 entityMananger.close();
		return alunno;
	}
	
	public List<Alunno> list() {
		EntityManager entityMananger = getEntityManager();
		Query query = entityMananger.createQuery("from "+entityClass.getSimpleName());
		List<Alunno> list=  query.getResultList();
		entityMananger.close();
		return list;
	}
}
