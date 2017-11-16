package com.yourcodelab.service;

import java.util.List;

import com.yourcodelab.dao.CityDAO;
import com.yourcodelab.model.City;

public class CityService {
	// DAO to access the database
	private CityDAO dao;
	
	public CityService() {
		dao = new CityDAO();
	}
	
	/**
	 * List cities by state
	 * @param state
	 * @return
	 */
	public List<City> listCityByState(String state){
		return dao.listCityByState(state);
	}
}
