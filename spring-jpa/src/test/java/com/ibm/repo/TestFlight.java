package com.ibm.repo;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;
import com.ibm.repo.FlightRepositoryImpl;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:appctx.xml")

public class TestFlight {
	@Autowired
	private FlightRepository repo;
	
	@Test
	public void testSave() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
	//	FlightRepository repo = (FlightRepository) ctx.getBean("repo");
		Flight f = new Flight();
		f.setCode(151);
		f.setSource("Chennai");
		f.setDestiny("Kolkata");
		f.setCarrier("Air Asia");
		System.out.println("Flight " + f.getCarrier()+" "+ f.getSource()+" "+f.getDestiny());
		repo.save(f);
	}
	@Test
	public void testFetch() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		// FlightRepository repo = (FlightRepository) ctx.getBean("repo");
		Flight f = repo.fetch(121);
		System.out.println("Flight " + f.getCarrier() + f.getSource()+f.getDestiny());
		
	}
	
	@Test
	public void testFetchAll() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		// FlightRepository repo = (FlightRepository) ctx.getBean("repo");
		List<Flight> list = repo.fetchAll();
		for(Flight flight : list) {
			System.out.println(flight.getCode()+flight.getCarrier()+flight.getSource()+flight.getDestiny());
		}
		
	}
	@Test
	public void testFetchByCarrier() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		// FlightRepository repo = (FlightRepository) ctx.getBean("repo");
		List<Flight> list = repo.fetchByCarrier("Air Asia");
		list.forEach(System.out::println);
		/*for(Flight flight: list) {

		System.out.println(flight.getCode() + " "+ flight.getSource()+" "+flight.getDestiny());
		
		}*/
	}
	@Test
	public void testFetchByRoute() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		// FlightRepository repo = (FlightRepository) ctx.getBean("repo");
		List<Flight> flights = repo.fetchByRoute("Hyderabad","Delhi");
		flights.forEach(System.out::println);
		/*for(Flight flight: flights) {

			System.out.println(flight.getCode() + " "+ flight.getCarrier()+" "+flight.getSource()+" "+flight.getDestiny());
			
			}*/
		
	}
	@Test
	public void testUpdate() {
		Flight f = new Flight();
		f.setCode(161);
		f.setSource("Gangtok");
		f.setDestiny("Shimla");
		f.setCarrier("Indigo");
		System.out.println("Flight " + f.getCarrier()+" "+ f.getSource()+" "+f.getDestiny());
		repo.update(f);
		
	}
	
	@Test
	public void testRemove() {
		
		repo.remove(121);
		
	}

}
