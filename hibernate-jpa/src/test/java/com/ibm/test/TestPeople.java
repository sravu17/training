package com.ibm.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.ibm.entity.Passport;
import com.ibm.entity.Person;

public class TestPeople {
	@Test
	public void testSavePerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		Person p1 = new Person();
		p1.setName("Jake");
		p1.setAge(23);
		
		
		mgr.persist(p1);
		txn.commit();
		
		mgr.close();
		emf.close();
		
	}
	@Test
	public void testGetPerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		
		Person p = mgr.find(Person.class,5);
		System.out.println(p.getName() + "\t" + p.getAge());
		
		mgr.close();
		emf.close();
	}
	@Test
	public void testsavePassport() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		Passport p = new Passport();
		p.setPassportNo(1234567);
		p.setCountry("India");
		
		Person p1 = mgr.find(Person.class, 6);
		p.setCitizen(p1);
		
		mgr.persist(p);
		txn.commit();
		
		mgr.close();
		emf.close();
	
	}
	
	@Test
	public void testGetPassport() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		
		Passport p = mgr.find(Passport.class, 5);
	}
	
	@Test
	public void testDelPerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		txn.begin();
		Person p = mgr.find(Person.class, 9);
		mgr.remove(p);
		txn.commit();
		
		mgr.close();
		emf.close();
	}
}
