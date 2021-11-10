package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Flight;

@Repository("repo")
public class FlightRepositoryImpl implements FlightRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public void save(Flight f) {
		em.persist(f);

	}

	@Override
	public List<Flight> fetchAll() {
		return em.createQuery("from Flight").getResultList();
		
	}

	@Override
	public Flight fetch(int code) {
		return em.find(Flight.class,code);
	}

	@Override
	public List<Flight> fetchByCarrier(String carrier) {
		Query query= em.createQuery("from Flight where carrier='" + carrier +"'");
		return query.getResultList();
		}

	@Override
	public List<Flight> fetchByRoute(String source, String destiny) {
		
		//Query query = em.createQuery("from flight where source=:src to destiny=:dest");
		Query query = em.createNamedQuery("byRoute");
		query.setParameter("src", source);
		query.setParameter("dest", destiny);
		return query.getResultList();
	}

	@Transactional
	public void update(Flight f) {
		em.merge(f);
		
	}

	@Transactional
	public  void remove(int code) {
		Flight f = em.find(Flight.class,code);
		em.remove(f);
	
		
	}
	

}
