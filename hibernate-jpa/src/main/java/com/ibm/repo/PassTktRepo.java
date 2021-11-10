package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Employee;
import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

public class PassTktRepo {
	private EntityManager getManager(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		return mgr;
	}
	public void savePass(Passenger pass,int pnr) {
		EntityManager mgr = getManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		Ticket t = mgr.find(Ticket.class,pnr);
		pass.setTkt(t);
		mgr.persist(pass);
		txn.commit();
		mgr.close();
	}
	public void saveTkt(Ticket tkt) {
		EntityManager mgr = getManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		mgr.persist(tkt);
		txn.commit();
		mgr.close();
		
	}
	public Passenger getPass(int id) {
		EntityManager mgr = getManager();
		return mgr.find(Passenger.class, id);
	}
	public List<Passenger> getAllPass(){
		EntityManager mgr = getManager();
		return mgr.createQuery("from Passenger").getResultList();
	}
	public Ticket getTkt(int pnr) {
		EntityManager mgr = getManager();
		return mgr.find(Ticket.class, pnr);
	}
	public List<Ticket> getAllTkt(){
		EntityManager mgr = getManager();
		return mgr.createQuery("from Ticket").getResultList();
	}
}
