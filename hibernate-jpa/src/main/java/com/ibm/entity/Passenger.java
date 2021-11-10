package com.ibm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
	@Id
	private int id;
	private String name;
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "pnr")
	private Ticket tkt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Ticket getTkt() {
		return tkt;
	}
	public void setTkt(Ticket tkt) {
		this.tkt = tkt;
	}
	
}
