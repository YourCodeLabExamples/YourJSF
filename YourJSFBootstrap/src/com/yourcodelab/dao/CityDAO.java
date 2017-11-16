package com.yourcodelab.dao;

import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.model.City;

public class CityDAO {
	public List<City> listCityByState(String state) {
		List<City> list = new ArrayList<City>();
		if(state.equals("PR")) {
			list.add(new City(7535, "Curitiba", "PR"));
			list.add(new City(7436, "São José dos Pinhais", "PR"));
			list.add(new City(7238, "Colombo", "PR"));
		}else {
			list.add(new City(1234, "Florianopolis", "SC"));
			list.add(new City(4321, "Bal. Camboriu", "SC"));
			list.add(new City(4444, "Itapema", "SC"));
		}
		return list;
	}
}
