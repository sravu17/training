package com.ibm.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

import com.ibm.repo.PassTktRepo;



public class TestPassTkt {
	private static PassTktRepo repo;

	@BeforeAll
	public static void init() {
		repo = new PassTktRepo();
	}
	
	@Test
	public void testSaveTkt() {
		Ticket t = new Ticket();
		t.setPnr(191);
		t.setAmount(750);
		t.setTravelDate(LocalDate.now() );
		repo.saveTkt(t);
	}
	@Test
	public void testSavePass() {
		Passenger p = new Passenger();
		p.setName("Jake");
		p.setId(9);
		p.setAge(24);
		repo.savePass(p, 191);
		
	}
	
	
	@Test
	public void getPass() {
		Passenger p = repo.getPass(1);
		System.out.println("Passenger : "+ p.getName() + " " + p.getAge() );
		
	}
	@Test
	public void getTkt() {
		Ticket t = repo.getTkt(131);
		System.out.println("Ticket : " +t.getAmount()+" "+ t.getTravelDate() );
	}
	
	@Test
	public void getAllPass() {
		List<Passenger> list1 = repo.getAllPass();
		for (Passenger p : list1) {
			System.out.println("All Passengers list : " + p.getId()+ " "+ p.getName()+" "+ p.getAge());
			
		}
		
	}
	@Test
	public void getAllTkt() {
		List<Ticket> list = repo.getAllTkt();
		for(Ticket t : list) {
			System.out.println(t.getPnr()+" "+ t.getAmount()+" "+t.getTravelDate());
		}
	}
}
