package com.xworkz.prgm;

import java.io.Serializable;

public class ZooExample implements Serializable{
	
	private Integer id ;
	private String name;
	private String stateName;
	private Integer ticketPrice;
	
	public ZooExample (Integer id, String name, String stateName, Integer ticketPrice) {
	super();
	this.id=id;
	this.name=name;
	this.stateName=stateName;
	this.ticketPrice=ticketPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		
		return "ZooExample [ id=" +id +", name=" + name + ", + stateName=" + stateName +", ticketPrice=" + ticketPrice + "]";

	}
	
	
}
