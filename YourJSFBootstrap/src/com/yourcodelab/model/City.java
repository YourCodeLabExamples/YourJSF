package com.yourcodelab.model;

public class City {
	private Integer idCity;
	private String name;
	private String state;
	
	public City(Integer idCity, String name, String state) {
		this.idCity = idCity;
		this.name = name;
		this.state = state;
	}
	
	public Integer getIdCity() {
		return idCity;
	}
	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
