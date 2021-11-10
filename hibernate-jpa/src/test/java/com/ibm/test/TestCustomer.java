package com.ibm.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.ibm.entity.Customer;

public class TestCustomer {
	@Test
	public void TestSaveCustomer() {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
			
			EntityManager mgr = emf.createEntityManager();
			EntityTransaction txn = mgr.getTransaction();
			
			txn.begin();
			Customer c1 = new Customer();
			c1.setCustName("Srav");
			c1.setCustId(4);
			c1.setCity("Hyderbad");
			
			
			mgr.persist(c1);
			txn.commit();
			
			mgr.close();
			emf.close();

	}
	@Test
	public void TestRemoveCustomer() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		Customer c1 = mgr.find(Customer.class,4);
		
		mgr.remove(c1);
		txn.commit();
		
		mgr.close();
		emf.close();
		
	}
	@Test
	public void TestUpdateCustomer() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		Customer c1 = mgr.find(Customer.class,1);
		c1.setCustName("Srav");
		
		mgr.merge(c1);
		txn.commit();
		
		mgr.close();
		emf.close();
		
	}

}
